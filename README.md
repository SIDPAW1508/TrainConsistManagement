# 🚂 Train Consist Management App – UC11

## 📚 Use Case 11: Validate Train ID & Cargo Codes (Regex)

In **UC10**, the system successfully calculates total seating capacity.  
However, all previous use cases assume that the input data is already valid and well-formed.

In real railway systems, user input can be:
- Incorrectly formatted  
- Inconsistent with business rules  
- Prone to human error  

For example:
- ✔ Valid Train ID: `TRN-1234`  
- ❌ Invalid Train ID: `TRAIN12`, `TRN12A`, `1234-TRN`  


## 🛠️ Key Concepts
- **Regular Expressions (Regex)** – Enforce structure rules such as `TRN-1234`  
- **Pattern Class** – Represents a compiled regex pattern  
- **Matcher Class** – Applies a pattern to input strings  
- **matches() Method** – Verifies whether the entire input string conforms to the regex  
- **Format Enforcement** – Ensures Train IDs and Cargo Codes follow strict rules  
- **Data Integrity Validation** – Prevents malformed data from entering the system  


