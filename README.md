#  Train Consist Management App – UC4

##  Use Case 4: Maintain Ordered Bogie IDs (LinkedList)

In **UC3**, we ensured uniqueness of bogie IDs using `HashSet`.  
While this solved duplication, it introduced a new problem: **HashSet does not preserve order**.  

A train must follow a physical sequence:
Locomotive → Passenger → Cargo → Guard Coach
With `HashSet`, the arrangement becomes unpredictable, which is unacceptable for real-world train formation.  
To model this chaining behavior, we use **LinkedList**.

---

##  Key Concepts
- **LinkedList** – Doubly linked list implementation of the `List` interface  
- **Node Structure** – Each element links to previous and next nodes  
- **addFirst() / addLast()** – Attach bogies at the beginning or end  
- **add(index, element)** – Insert bogies in the middle  
- **removeFirst() / removeLast()** – Detach bogies from head or tail  
- **Order Preservation** – Maintains physical sequence of train bogies  

---
