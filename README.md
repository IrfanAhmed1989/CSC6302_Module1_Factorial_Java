# CSC6302_Module1_Factorial_Java
Java implementation of factorial program converted from Python. Matches original behavior for academic project.

# CSC6302 Module 1: Factorial Program (Java)

Converted Python factorial program to Java with **exact behavior parity**:

- Same prompts:
  - `Enter an positive Integer:`
  - `Sorry, only positive numbers, enter again:`
- Negative integers re-prompt until a non-negative integer is entered.
- Non-integer inputs (e.g., `abc`, `3.5`) intentionally crash with `NumberFormatException` (mirrors Python's `ValueError`).
- Whitespace around numeric input is accepted via `.trim()` (matches Python’s `int(input())`).

**Environment:** macOS (Apple Silicon) using **OpenJDK 25.0.1**  
**Course:** CSC6302 – Module 1: Project #1  
**Author:** Irfan Ahmed  
**File:** `FactorialCalculator.java`

## Quick Run
```bash
javac FactorialCalculator.java
java FactorialCalculator
