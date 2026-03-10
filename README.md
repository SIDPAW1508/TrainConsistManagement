#  Train Consist Management App – UC6

##  Use Case 6: Map Bogie to Capacity (HashMap)

In **UC5**, the train formation stored only the names of bogies in order and ensured uniqueness.  
However, a real railway system does not operate using names alone. Each bogie has important operational attributes such as:

- Seating capacity for passenger bogies  
- Load capacity for goods bogies  
- Safety limits and constraints  

With only a `Set` of strings:
-  No way to associate data with a bogie  
-  Capacity information cannot be stored  
-  The system cannot perform analytics or validation  

To solve this, we use a **HashMap** to associate bogie names with their capacities.

---


## Key Concepts
- **HashMap** – Stores data in key–value pairs  
- **Map Interface** – Represents a mapping between unique keys and values  
- **put()** – Inserts a key–value pair (bogie → capacity)  
- **Key–Value Association** – Models real-world relationships (e.g., `"Sleeper" → 72 seats`)  
- **entrySet() Iteration** – Allows iteration over both keys and values  
- **Fast Lookup** – Retrieve capacity in constant time using bogie name  
