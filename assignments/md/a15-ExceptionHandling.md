### **Problem Statement:**

Write a program that accepts two integers from the user and performs division. Use exception handling to manage the following cases:

1. Division by zero (should display an error message and ask for new input).
2. Invalid input (non-integer input should display an error message and ask for new input).

**Requirements:**

- Use `try-catch` blocks to handle exceptions.
- Ensure the program keeps asking for valid input if an exception occurs.
- Print the result of the division when valid inputs are provided.

**Example Input/Output:**

```
Enter the first number: 10
Enter the second number: 0
Error: Division by zero is not allowed. Please enter a valid number.

Enter the second number: 5
Result: 2