import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from IPython.display import display
from AnimalShelter import AnimalShelter
from sklearn.cluster import KMeans
import warnings
warnings.filterwarnings("ignore")

# Connect to MongoDB through AnimalShelter wrapper
shelter = AnimalShelter('aacuser', 'SNHU1234')
data = shelter.read({})
df = pd.DataFrame(data)

# --- DATA CLEANING ---
df = df[df['age_upon_outcome'].notnull() & df['animal_type'].notnull() & df['breed'].notnull()]

def convert_age_to_years(age_str):
    if not isinstance(age_str, str):
        return 0
    num, unit = age_str.split()[:2]
    num = int(num)
    if 'day' in unit:
        return num / 365
    elif 'week' in unit:
        return num / 52
    elif 'month' in unit:
        return num / 12
    return num

df['age_in_years'] = df['age_upon_outcome'].apply(convert_age_to_years)

# --- DASHBOARD SECTION 1: Age Distribution ---
plt.figure(figsize=(10,5))
sns.histplot(df['age_in_years'], bins=30, kde=True)
plt.title('Distribution of Animal Ages (in Years)')
plt.xlabel('Age (Years)')
plt.ylabel('Count')
plt.grid(True)
plt.show()

# --- DASHBOARD SECTION 2: Most Common Breeds ---
top_breeds = df['breed'].value_counts().head(10)
top_breeds.plot(kind='barh', figsize=(10,5), color='skyblue')
plt.title('Top 10 Most Common Breeds')
plt.xlabel('Count')
plt.ylabel('Breed')
plt.grid(True)
plt.gca().invert_yaxis()
plt.show()

# --- DASHBOARD SECTION 3: Animal Type Distribution ---
sns.countplot(data=df, x='animal_type', palette='Set2')
plt.title('Animal Type Distribution')
plt.xlabel('Animal Type')
plt.ylabel('Count')
plt.grid(True, axis='y')
plt.show()

# --- DASHBOARD SECTION 4: K-Means Clustering by Age ---
kmeans_df = df[['age_in_years']].dropna()
kmeans = KMeans(n_clusters=3)
kmeans.fit(kmeans_df)
kmeans_df['Cluster'] = kmeans.labels_

plt.figure(figsize=(8,5))
sns.histplot(data=kmeans_df, x='age_in_years', hue='Cluster', bins=30, palette='husl')
plt.title('K-Means Clustering of Animals by Age')
plt.xlabel('Age in Years')
plt.ylabel('Count')
plt.show()

# --- Optional Display: Show Table of Results ---
display(df[['animal_id', 'animal_type', 'breed', 'age_upon_outcome', 'age_in_years']].head(10))
