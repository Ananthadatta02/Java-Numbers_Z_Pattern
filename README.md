
# Numbers Z Pattern in Java

This Java program prints a Z-shaped number pattern based on a user-input number `n`. Below is a detailed explanation of the program, including the use of classes, variables, loops, and logic.

---

## 📌 Example Output (for n = 5):
```
12345
    5
   4 
  3  
 2   
12345
```

---

## 📦 Package Declaration

```java
package number_patterns;
```

This statement places the class into the `number_patterns` package, allowing for better code organization.

---

## 📥 Import Statement

```java
import java.util.Scanner;
```

This imports the `Scanner` class from Java's `util` package, which is used for capturing user input.

---

## 🚀 Class and Main Method

```java
public class Numbers_Z_Pattern {
    public static void main(String[] args) {
        ...
    }
}
```

- **Class**: `Numbers_Z_Pattern` contains the entire program.
- **`main` method**: The entry point of the Java program.

---

## 🧠 Inside the Main Method

### 🔹 Scanner Class

```java
Scanner s = new Scanner(System.in);
```

- Creates a `Scanner` object `s` to read input from the user.
- `System.in` indicates input is from the keyboard.

### 🔹 Prompt User

```java
System.out.println("Enter the Number");
int n = s.nextInt();
```

- Prompts the user to enter an integer.
- `s.nextInt()` reads the integer and stores it in variable `n`.

### 🔹 Variable Initialization

```java
int num = n - 1;
```

- `num` is initialized to one less than `n`, used for printing numbers in the diagonal of the "Z".

---

## 🔁 Outer Loop (Rows)

```java
for (int i = 0; i < n; i++) {
    ...
}
```

- Iterates over each row (`i` is the row index).
- Total rows = `n`.

---

## 🔁 Inner Loop (Columns)

```java
for (int j = 0; j < n; j++) {
    ...
}
```

- Iterates over each column (`j` is the column index).
- Total columns = `n`.

---

## 🖨️ Printing Logic

```java
if (i == 0 || i == n - 1)
    System.out.print(j + 1);
else if (j == n - i - 1)
    System.out.print(num--);
else
    System.out.print(" ");
```

### Condition Breakdown:

1. **`i == 0 || i == n - 1`**:  
   - First or last row → print numbers `1` to `n`.

2. **`j == n - i - 1`**:  
   - For middle rows, only print numbers on the diagonal from top-right to bottom-left.
   - Decrements `num` after each print to display decreasing values.

3. **Else**:  
   - Print a space `" "` in all other positions.

### Line Break:

```java
System.out.println();
```

Moves to the next line after completing one row.

---

## 🧼 Close Scanner

```java
s.close();
```

Closes the `Scanner` object to free up resources.

---

## ✅ Summary

This code generates a Z-shaped pattern using nested loops and conditional checks. It demonstrates:
- Input handling using `Scanner`
- Nested loop structures
- Conditional formatting
- Simple logic to place numbers diagonally and in rows

---
## Clone
```
git clone https://github.com/Ananthadatta02/Java-Numbers_Z_Pattern.git
```
