#  Train Consist Management App – UC8

##  Use Case 8: Filter Passenger Bogies Using Streams

In **UC7**, bogies were sorted based on seating capacity using `Comparator`.  
While sorting organizes data, it does not allow the system to **select specific bogies based on conditions**.

In real railway operations, administrators often need to:
- Display only **high-capacity bogies**  
- Exclude **low-capacity or special-purpose bogies**  
- Apply **business rules dynamically**  

Using traditional loops:
-  Code becomes verbose and imperative  
-  Logic is mixed with iteration  
-  Harder to read and maintain  

To express filtering logic clearly and concisely, we introduce the **Java Stream API**.


## 🛠️ Key Concepts
- **Stream API** – Processes collections in a declarative style  
- **stream() Method** – Converts a collection into a stream pipeline  
- **filter() Operation** – Selects elements that satisfy a condition (e.g., capacity > 60)  
- **Lambda Expressions** – Concise behavior definition for filtering logic  
- **collect() / toList()** – Converts the processed stream back into a collection  
- **Declarative Programming Style** – Focuses on *what* to do, not *how* to iterate  

