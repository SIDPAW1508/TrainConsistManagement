#  Train Consist Management App – UC5

##  Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)

In **UC4**, we maintained order using `LinkedList`.  
While this solved physical sequencing, it did not enforce **uniqueness**.  
Train yards often perform last-minute attachments and emergency removals, where duplicates must be prevented and the **original insertion order preserved**.

To achieve this, we use **LinkedHashSet**.


---

## 🛠️ Key Concepts
- **LinkedHashSet** – Stores unique elements while preserving insertion order  
- **Set Interface** – Prevents duplicate bogies in the train consist  
- **add()** – Inserts bogies; duplicates are ignored automatically  
- **Automatic Deduplication** – No manual checks required  
- **Insertion Order Preservation** – Bogies are printed in the same order they were attached  
- **Ordered Iteration** – Iterating or printing returns bogies in original sequence  