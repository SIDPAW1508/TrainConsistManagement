# Train Consist Management App

## Overview

The **Train Consist Management App** is a Java-based console application that simulates how a railway system manages a train’s consist (collection of bogies attached to an engine).
It demonstrates core **Java concepts, data structures, algorithms, and exception handling** through structured use cases (UC1–UC20). 

---

## Features

* Add, remove, and manage passenger bogies
* Track unique bogie IDs
* Maintain ordered train formation
* Map bogies to seating capacity
* Sort and filter bogies
* Group bogies by type
* Calculate total seating capacity
* Validate train IDs and cargo codes (Regex)
* Safety compliance for goods bogies
* Performance comparison (Loop vs Streams)
* Custom exception handling
* Searching algorithms (Linear & Binary Search)

---

## Tech Stack

* Java (Core Java)
* Java Collections Framework
* Java Stream API
* Regex (Pattern, Matcher)
* Exception Handling
* Algorithms (Sorting & Searching)

---

## Project Structure

```id="y8n3pq"
com.seveneleven.trainconsistmanagement
│
├── app/
│   └── TrainConsistApp.java
├── model/
├── exception/
└── utility/
```

---

## Key Concepts Covered

### Collections

* ArrayList, LinkedList
* HashSet, LinkedHashSet
* HashMap

### Algorithms

* Bubble Sort
* Arrays.sort()
* Linear Search
* Binary Search

### Streams

* filter(), map(), reduce()
* groupingBy()
* collect()

### Exception Handling

* Custom exceptions (InvalidCapacityException, CargoSafetyException)
* try-catch-finally
* Defensive programming

### Validation

* Regex for Train ID and Cargo Code

---

## Use Cases

The application is divided into multiple use cases:

* **UC1–UC6** → Basic collections & CRUD
* **UC7–UC10** → Sorting, filtering, grouping, aggregation
* **UC11–UC12** → Validation & safety rules
* **UC13–UC15** → Performance & exception handling
* **UC16–UC20** → Algorithms (sorting & searching) + fail-fast design

---

## How to Run

1. Compile:

```id="k1n8xy"
javac TrainConsistApp.java
```

2. Run:

```id="p4z9lm"
java com.seveneleven.trainconsistmanagement.app.TrainConsistApp
```

---

## Sample Functional Flow

1. Initialize train
2. Add passenger bogies
3. Track unique IDs
4. Sort and filter bogies
5. Validate inputs
6. Perform searches
7. Handle errors safely

---

## Highlights

* Demonstrates real-world railway scenario
* Covers both **DSA + Core Java** in one project
* Shows difference between **loops vs streams**
* Implements **fail-fast and defensive programming**

---

## Limitations

* Console-based application
* No database integration
* Static dataset (no persistent storage)

---

## Author

Java Train Consist Management Project
