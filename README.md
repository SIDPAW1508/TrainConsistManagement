#  Train Consist Management App – UC10

##  Use Case 10: Count Total Seats in Train (reduce)

In **UC9**, bogies were organized into logical groups using `groupingBy()`.  
While grouping structures the data, it does not provide **numerical insight**.

In real railway operations, administrators often need to:
- Know the **total seating capacity** of the train  
- Estimate **passenger handling capability**  
- Perform **utilization planning**  

With only grouped lists:
-  No total metrics are available  
-  No aggregation is performed  
-  Decision-making lacks quantitative support  

To compute meaningful values, we introduce aggregation using **reduce()**.

---
