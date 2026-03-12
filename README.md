# UC20 – Exception Handling During Search Operations

UC20 demonstrates **defensive programming** during search operations.

Before performing a search, the system validates whether any **bogies exist in the train**.  
If the bogie collection is empty, the system throws an `IllegalStateException` and stops the operation immediately.

---

## Flow

1. User triggers a **search operation**.
2. System checks if the **bogie collection is empty**.
3. If empty, an `IllegalStateException` is thrown.
4. A **meaningful error message** is displayed.
5. Search logic is **prevented from executing**.

---

## Concepts Used

- Defensive Programming  
- Fail-Fast Principle  
- Runtime Exceptions (`IllegalStateException`)  
- State validation before processing  

---

## Purpose

This use case ensures that **invalid search operations are prevented early**, improving:

- **System reliability**
- **Code safety**
- **Error handling robustness**

By validating system state before execution, the application follows the **fail-fast approach**, avoiding unnecessary processing when the system is not in a valid state.