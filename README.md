#  Train Consist Management App – UC12

## Use Case 12: Safety Compliance Check for Goods Bogies

In **UC11**, the system validated Train IDs and Cargo Codes using Regex.  
However, all previous use cases assumed that cargo assignments were always valid.  

In real railway logistics, this is dangerous:
- Certain bogie shapes are designed only for specific cargo.  
- Cylindrical bogies are meant for **liquids like petroleum**.  
- Assigning wrong cargo can cause leaks, fire hazards, or derailment risks.  

Without validation:
- Unsafe cargo may enter the system  
- Business rules are violated silently  
- Train formation becomes operationally risky  

---


##  Key Concepts
- **Streams API** – Declarative way to process collections  
- **allMatch()** – Checks if every element satisfies a condition  
- **Lambda Expressions** – Express validation rules inline  
- **Conditional Logic in Streams** – Enforces domain-specific constraints  
- **Short-Circuit Evaluation** – Stops processing as soon as a rule fails  
- **Business Rule Modeling** – Converts safety policies into executable logic  

