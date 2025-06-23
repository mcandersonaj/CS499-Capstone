# Databases: Artifact Three CS340

This artifact was from the CS340 class and was created in August of 2024. This artifact was for an Animal shelter that took breeds of cats and dogs. The artifact took the data from the shelters and input it into a database which would then be queried to see certain information on the animals in it. This data could then be used to figure out which animals could be used for training purposes for certain rescue activities. These activities would give certain requirements like age, breed, and gender and the artifact would output the animals that met these requirements.

I selected this artifact because I wanted to work with a database that had large amounts of data to read and I wanted to try data mining work for the first time. By picking this artifact and a topic that I had not learned specifically from the SNHU program and then apply it to something from the SNHU program. By taking the database and providing different queries I was able to obtain different forms of data from it that I could then use to make informed decisions based on the trends that I find in the data. With this artifact I was able to demonstrate the ability to learn new techniques and apply it to something else to find new information about something I had worked on. 

```
# --- DASHBOARD SECTION 2: Most Common Breeds ---
top_breeds = df['breed'].value_counts().head(10)
top_breeds.plot(kind='barh', figsize=(10,5), color='skyblue')
plt.title('Top 10 Most Common Breeds')
plt.xlabel('Count')
plt.ylabel('Breed')
plt.grid(True)
plt.gca().invert_yaxis()
plt.show()
```

While working on this artifact I learned more about data mining and how it can be done with a MongoDB. This skill was something I had interest in learning but never got the opportunity to take the elective, so I wanted to take the time to go and learn more about it and apply that knowledge into my capstone project. My biggest challenge was trying to learn as much about data mining while also keeping focus on the project itself. There would be little point in going through and trying to learn the information without applying it so I had to be sure to keep myself in check and work and research appropriately as I did not have the luxury of time. By learning about the different ways I could query the database and use that information, I was able to learn more about how this particular way of data mining works. Feedback was similar to the other artifacts so I made sure to go back and comment on the sections of code to ensure that it would be easier to read. The artifact wasn’t necessarily improved, it was more that this enhancement was made to make information to the user clearer without changing the function of the artifact. This artifact demonstrates my ability to create a solution with new techniques and tools as well as designing solutions while managing trade-offs. It also partially shows the visual communications by showing the information from the database. This artifact does not show security as I made no changes to the mongoDB log-in information, and it doesn’t show any collaborative environments.


### [Link to Artifact Three Repository](https://github.com/mcandersonaj/CS499-Capstone/tree/main/Databases)

## ePortfolio Links
- [Main page](https://mcandersonaj.github.io/CS499-Capstone/)
- [Code Review](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/CodeReview)
- [Artifact One](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/ArtifactOne)
- [Artifact Two](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/ArtifactTwo)
- [Artifact Three](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/ArtifactThree)
