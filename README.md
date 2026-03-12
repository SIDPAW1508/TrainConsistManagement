# UC15 – Safe Cargo Assignment (try-catch-finally)

UC15 demonstrates **runtime exception handling** for unsafe cargo assignments in the **Train Consist Management App**.

Instead of stopping execution during object creation (as in **UC14**), this use case handles errors that occur during **runtime operations**.

---

## Key Idea

If **Petroleum** is assigned to a **Rectangular bogie**, the system throws a custom runtime exception called:

`CargoSafetyException`

The exception is handled using **try-catch-finally**, ensuring the application **does not crash** and continues running safely.

---

## Flow

1. User attempts to assign cargo to a **goods bogie**.
2. System checks **shape and cargo compatibility**.
3. If unsafe, a **CargoSafetyException** is thrown.
4. The exception is **caught** and an **error message** is displayed.
5. The **finally block** runs logging or cleanup operations.
6. The **program continues execution**.

---

## Concepts Used

- Custom Runtime Exception
- `throw` keyword
- `try-catch-finally`
- Runtime validation

---

## Purpose

This mechanism ensures:

- **Safe cargo handling**
- **Stable program execution**
- **Proper runtime error management**

Even if an unsafe cargo assignment occurs, the system **handles the error gracefully without stopping the application**.