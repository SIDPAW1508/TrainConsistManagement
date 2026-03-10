#  Train Consist Management App – UC8

## Use Case 7: Sort Bogies by Capacity (Comparator)

In **UC6**, bogies were mapped to their capacities using a `HashMap`.  
In **UC7**, bogies were modeled as objects and sorted using a `Comparator`.  

However, railway administration often needs **analytics**:
- Identify **high-capacity bogies first**  
- Arrange bogies for **optimal usage**  
- Compare passenger capacity across classes  

With only storage:
-  Bogies are not ranked  
-  No logical ordering  
-  Planning and reporting become difficult  

To solve this, we use **Comparator** to sort bogies by capacity.
