from pymongo import MongoClient
from bson.objectid import ObjectId

class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """
    def __init__(self, username, password):
        # Initializing the MongoClient. This helps to
        # access the MongoDB databases and collections.
        # This is hard-wired to use the aac database, the
        # animals collection, and the aac user.
        # Definitions of the connection string variables are
        # unique to the individual Apporto environment.
        #
        # You must edit the connection variables below to reflect
        # your own instance of MongoDB!
        #
        # Connection Variables
        #
        # USER = 'aacuser'
        # PASS = 'SNHU1234'
        HOST = 'nv-desktop-services.apporto.com'
        PORT = 32570
        DB = 'AAC'
        # COL = 'animals'
        USER = username
        PASS = password
        # HOST = 'localhost'
        # PORT = 27017
        # DB = 'aac'
        COL = 'animals'
        #
        # Initialize Connection
        #
        self.client = MongoClient('mongodb://%s:%s@%s:%d' % (USER,PASS,HOST,PORT))
        self.database = self.client['%s' % (DB)]
        self.collection = self.database['%s' % (COL)]

# Complete this create method to implement the C in CRUD.
    def create(self, data):
        if data is not None:

            # Do not call insert within an if statement,
            # as it can lead to race conditions.
            # Instead, use insert_one() method which is thread-safe.
            #
            # Also, use a dictionary for data, not a string,
            # as MongoDB will automatically convert string keys to ObjectId.
            #
            # Here is an example of how to create an animal:
            #
            # data = {
            #     'name': 'Max',
            #     'age': 3,
            #     'type': 'dog',
            #     'animal_id': 'A999988'
            # }
            #
            # self.database.animals.insert_one(data)
            # evaluate the return type from insert_one independently 
            result = self.database.animals.insert_one(data)

            if result.inserted_id:  # data should be dictionary
                return True
            # default return for creation
            return False
        else:
            raise Exception("Nothing to save, because data parameter is empty")

# Create method to implement the R in CRUD.
    def read(self, data):
        if data:
            searchData = self.database.animals.find(data, {"_id": False})
        else:
            searchData = self.database.animals.find({}, {"_id": False})
        # return data
        # Doctor Wilson says, return a list of objects here instead of the database Curso object
        return [dict(doc) for doc in searchData]
        # or return list(serchData)
        # return searchData

# Create method to implement the U in CRUD.
    def update(self, searchData, updateData):
        if searchData is not None:
            result = self.database.aniamls.update_many(searchData, {"$set": updateData})
        else:
            return "{}"
        return result.raw_result

# Create method to implement the D in CRUD.
    def delete(self, data):
        if data is not None:
            result = self.database.animals.delete_many(data)
        else:
            return "{}"
        return result.raw_result

# Part of the data mining to find the most common 5 breeds.
    def most_common_breeds(self, limit=5):
        pipeline = [
            {"$group": {"_id": "$breed", "count": {"$sum": 1}}},
            {"$sort": {"count": -1}},
            {"$limit": limit}
     ]
     return list(self.database.animals.aggregate(pipeline))

# Another part of the data mining to allow the user to print certain fields.
# Call EX. print(shelter.get_field_distribution("breed")) will print the breeds 
    def get_field_distribution(self, field):
        pipeline = [
            {"$group": {"_id": f"${field}", "count": {"$sum": 1}}},
            {"$sort": {"count": -1}}
     ]
        return list(self.database.animals.aggregate(pipeline))



# Test the class methods by Dr. Wilson
#animal = {
#    'name': 'Geoffrey',
#    'age': 3,
#    'animal_id': 'A999988',
#    "age_upon_outcome": "3 years",
#    "animal_type": "Giraffe",
#    "breed": "Masai",
#    "color": "Black/White",
#    "date_of_birth": "2014-04-10",
#    "datetime": "2017-04-11 09:00:00",
#    "monthyear": "2017-04-11T09:00:00",
#}

#test = AnimalShelter()
#res = test.create(animal)
#print('Created operation response:', res)

#res = test.read({'animal_id': 'A999988'})
#print('Read operation response:', res)

#res = test.update({'name': 'Geoffrey'}, {'name': 'Georgina'})
#print('Update operation response:', res)

#res=test.read({'animal_id': 'A999988'})
#print('Updated: Read operation response:', res)

#res = test.delete({'animal_id': 'A999988'})
#print('Delete operation response:', res)

#res=test.read({'animal_id': 'A999988'})
#print('Deleted: Read opearation response:', res)
