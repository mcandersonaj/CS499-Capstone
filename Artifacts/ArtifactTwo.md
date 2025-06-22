# Algorithms and Data Structure: Artifact 2 IT145

### [Link to Artifact Two Repository](https://github.com/mcandersonaj/CS499-Capstone/tree/main/Algorithms%20and%20Data%20Structure)

This artifact is from IT145 and was created in June 2023. This artifact is a rescue animal training list done with array lists.The purpose of this assignment was to accept user input in the console to input animals that would be put into array lists and printed out based on certain criteria. The initial project accepted monkeys and dogs and worked with those two lists and printed out animals that finished training or the entire list.  

I selected this item to be enhanced because it was an early project in my SNHU computer science journey. I wanted to go back to a class very early on and look at what improvements I could make without changing the core of the artifact too much. By going through and adding to the project, I enhanced the number of animals it could be used for and added in a sorting feature to help the user better organize the data. With this project I demonstrated how I could add to projects without adding too many useless add-ons or changing the core aspects of the artifact. I showcased my ability to take what I learned and apply it to older projects such as the selection sort I used to sort the data and allow it to be used for the appropriate type of data. 


```
        //sort method
        public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
            int n = list.size();

            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (comparator.compare(list.get(j), list.get(maxIndex)) > 0) {
                        maxIndex = j;
                    }
                }

                if (maxIndex != i) {
                    T temp = list.get(i);
                    list.set(i, list.get(maxIndex));
                    list.set(maxIndex, temp);
                }
            }
        }
```
![test](https://github.com/user-attachments/assets/a35b3397-5068-484b-aef4-c7b3b4b46c8e)



## ePortfolio Links
- [Main page](https://mcandersonaj.github.io/CS499-Capstone/)
- [Code Review](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/CodeReview)
- [Artifact One](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/ArtifactOne)
- [Artifact Two](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/ArtifactTwo)
- [Artifact Three](https://mcandersonaj.github.io/CS499-Capstone/Artifacts/ArtifactThree)
