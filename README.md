#  Train Consist Management App – UC14

##  Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)

In **UC13**, the system focused on performance comparison, but it assumed all data was valid.  
In real railway systems, invalid input can easily enter the system, such as:
- Negative seat capacity  
- Zero capacity bogies  
- Corrupted configuration values  

If such values are allowed:
-  Passenger allocation becomes meaningless  
-  Safety and reporting break down  
-  Bugs propagate silently through later use cases  

Without validation, the train consist may contain bogies that can never carry passengers.  
Instead of allowing bad data and fixing it later, the system should **fail fast** at the moment of creation.  
This leads to **custom exception handling**.

---

##  Goal
Prevent invalid passenger bogies from being added to the train by enforcing capacity rules using a custom exception.

---

##  Key Concepts
- **Custom Exception** – User-defined exception for domain-specific errors  
- **Exception Inheritance** – Extend `Exception` to create checked exceptions  
- **throw Keyword** – Explicitly raise an exception when rules are violated  
- **throws Declaration** – Declares that a method/constructor may throw exceptions  
- **Fail-Fast Validation** – Detect errors early and stop incorrect object creation  
- **Business Rule Enforcement** – Encapsulates railway constraints in domain objects  

---

## Package Structure
