# UC19 – Binary Search for Bogie ID

UC19 demonstrates efficient searching using the **Binary Search algorithm** on **sorted bogie IDs**.

Unlike **UC18**, where **Linear Search** checks each element sequentially, **Binary Search** reduces the search range by half in every step, making it **much faster for large datasets**.

---

## Flow

1. User provides a **sorted array of bogie IDs**.
2. A **bogie ID** is selected as the **search key**.
3. System initializes **low** and **high** indexes.
4. The **middle element** is calculated and compared with the key.
5. The **search range is halved** based on the comparison.
6. The process repeats until the **bogie is found** or the **search range ends**.

---

## Concepts Used

- Binary Search Algorithm  
- Divide-and-Conquer strategy  
- Index-based traversal (`low`, `high`, `mid`)  
- String comparison using `compareTo()`  
- Optimized search with **O(log n)** complexity  

---

## Purpose

This use case introduces **efficient searching techniques** and highlights the importance of **sorted data** for optimized lookup operations.

Binary Search significantly improves performance when working with **large datasets**, making it a common technique in real-world systems.