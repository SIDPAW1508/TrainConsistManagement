#  Train Consist Management App

A console-based Java application that simulates how a railway system manages a train’s consist — the collection of bogies attached to an engine.  

This project introduces core Java concepts through realistic railway scenarios.

---

##  Features
- Passenger Bogies: Sleeper, AC Chair, First Class (with seat capacity tracking)  
- Goods Bogies: Rectangular, Cylindrical (with cargo type and safety constraints)  
- Train Consist Tracking: Composition, capacity, cargo types, and safety compliance  

---

##  Use Cases
### UC1: Initialize Train and Display Consist Summary
- Prints welcome message  
- Initializes an empty train consist using `ArrayList`  
- Displays bogie count and current consist (`[]`)  

Future use cases will add bogies dynamically and enforce safety rules.

---

##  Key Java Concepts
- **Class**: Encapsulates train app logic  
- **Main Method**: Entry point (`public static void main(String[] args)`)  
- **Static Keyword**: Allows JVM to invoke `main()` without an object  
- **ArrayList & List Interface**: Dynamic collection for bogies  
- **Console Output**: `System.out.println()` for messages and summaries  

---
