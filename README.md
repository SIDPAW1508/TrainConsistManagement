#  Train Consist Management App – UC9

##  Use Case 9: Group Bogies by Type (Collectors.groupingBy)

In **UC8**, bogies were filtered based on conditions such as seating capacity.  
While filtering selects relevant data, the result is still a **flat list**.

In real railway operations, administrators often need to:
- Separate **passenger bogies** from **goods bogies**  
- Organize bogies by **category or class**  
- Produce **structured reports** instead of raw lists  

With only filtering:
-  Data is not categorized  
-  Reporting becomes difficult  
-  Relationships between bogies are not visible  

To solve this, we use **Collectors.groupingBy()** to group bogies into categories.

---

