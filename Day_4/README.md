# DSA Day 4 Preparation

This repository contains my Day 4 notes for learning **Data Structures and Algorithms (DSA)** using **Python and Java**.

The main goal of Day 4 is to understand **nested loops** and use them to solve **pattern problems**.

In Day 1, I learned programming basics, Python vs Java, time complexity, space complexity, and constraints.

In Day 2, I learned conditions and decision making.

In Day 3, I learned loops and loop-based problems.

In Day 4, I am learning nested loops and pattern-based thinking.

---

## Day 4 Assets

- `Day4.png` - Day 4 cover image
- `DSA_Day_4.pdf` - Day 4 notes PDF (with `Day4.png` inserted as page 1)
- `python/day4_patterns.py` - Combined Day 4 Python pattern programs
- `java/Day4Patterns.java` - Combined Day 4 Java pattern programs
- `python/day4_square_star.py`, `python/day4_right_triangle_star.py`, `python/day4_number_triangle.py`, `python/day4_reverse_triangle_star.py`, `python/day4_square_number.py` - Individual Python pattern files
- `java/Day4SquarePattern.java`, `java/Day4RightTrianglePattern.java`, `java/Day4NumberTriangle.java`, `java/Day4ReverseTriangle.java`, `java/Day4SquareNumberPattern.java` - Individual Java pattern files

---

## Topics Covered

- What is a Nested Loop?
- Why Nested Loops are Important?
- Outer Loop and Inner Loop
- Time Complexity of Nested Loops
- Square Star Pattern
- Right Triangle Star Pattern
- Number Triangle Pattern
- Reverse Triangle Pattern
- Square Number Pattern
- Practice Problems
- LeetCode Practice Problems

---

## 1. What is a Nested Loop?

A nested loop means a loop inside another loop.

Simple idea:

```text
Outer loop:
    Inner loop:
        Do some work
```

In pattern problems:

```text
Outer loop → controls rows
Inner loop → controls columns
```

Example pattern:

```text
* * *
* * *
* * *
```

This pattern has:

```text
3 rows
3 columns
```

So we use:

```text
One loop for rows
One loop for columns
```

---

## 2. Why Nested Loops are Important?

Nested loops are important because they help us solve problems where we need to process values in two levels.

Examples:

```text
Pattern printing
Matrix problems
2D arrays
Comparing every element with every other element
Brute force problems
```

Nested loops are very common in DSA.

But we must be careful because nested loops usually increase time complexity.

---

## 3. Outer Loop and Inner Loop

For this pattern:

```text
* * *
* * *
* * *
```

Think like this:

```text
Row 1 → print 3 stars
Row 2 → print 3 stars
Row 3 → print 3 stars
```

So:

```text
Outer loop → runs for rows
Inner loop → runs for columns
```

For 3 rows and 3 columns:

```text
3 × 3 = 9 operations
```

---

## 4. Basic Nested Loop Example

### Python

```python
for i in range(3):
    for j in range(3):
        print("*", end=" ")
    print()
```

Output:

```text
* * *
* * *
* * *
```

Explanation:

```text
i controls rows
j controls columns
end=" " prints on the same line
print() moves to the next line
```

### Java

```java
class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

Output:

```text
* * *
* * *
* * *
```

Explanation:

```text
Outer loop controls rows
Inner loop controls columns
System.out.print() prints on the same line
System.out.println() moves to the next line
```

---

## 5. Time Complexity of Nested Loops

Example:

```python
for i in range(n):
    for j in range(n):
        print(i, j)
```

Outer loop runs `n` times.

Inner loop also runs `n` times for every outer loop.

Total operations:

```text
n × n = n²
```

Time Complexity:

```text
O(n²)
```

Space Complexity:

```text
O(1)
```

Reason:

```text
Time grows with n².
No extra memory grows with input size.
```

---

# Pattern Problems

## Pattern 1: Square Star Pattern

### Output

```text
* * *
* * *
* * *
```

### Logic

```text
For every row, print n stars.
```

### Python

```python
n = 3

for i in range(n):
    for j in range(n):
        print("*", end=" ")
    print()
```

### Java

```java
class SquarePattern {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

Time Complexity:

```text
O(n²)
```

Space Complexity:

```text
O(1)
```

---

## Pattern 2: Right Triangle Star Pattern

### Output

```text
*
* *
* * *
```

### Logic

```text
Row 1 → 1 star
Row 2 → 2 stars
Row 3 → 3 stars
```

### Python

```python
n = 3

for i in range(1, n + 1):
    for j in range(i):
        print("*", end=" ")
    print()
```

### Java

```java
class RightTrianglePattern {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

Time Complexity:

```text
O(n²)
```

Space Complexity:

```text
O(1)
```

---

## Pattern 3: Number Triangle Pattern

### Output

```text
1
1 2
1 2 3
```

### Logic

```text
Row 1 → print 1
Row 2 → print 1 2
Row 3 → print 1 2 3
```

### Python

```python
n = 3

for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(j, end=" ")
    print()
```

### Java

```java
class NumberTriangle {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

Time Complexity:

```text
O(n²)
```

Space Complexity:

```text
O(1)
```

---

## Pattern 4: Reverse Triangle Star Pattern

### Output

```text
* * *
* *
*
```

### Logic

```text
Row 1 → 3 stars
Row 2 → 2 stars
Row 3 → 1 star
```

### Python

```python
n = 3

for i in range(n, 0, -1):
    for j in range(i):
        print("*", end=" ")
    print()
```

### Java

```java
class ReverseTriangle {
    public static void main(String[] args) {
        int n = 3;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

Time Complexity:

```text
O(n²)
```

Space Complexity:

```text
O(1)
```

---

## Pattern 5: Square Number Pattern

### Output

```text
1 1 1
2 2 2
3 3 3
```

### Logic

```text
Print row number in every column.
```

### Python

```python
n = 3

for i in range(1, n + 1):
    for j in range(1, n + 1):
        print(i, end=" ")
    print()
```

### Java

```java
class SquareNumberPattern {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```

Time Complexity:

```text
O(n²)
```

Space Complexity:

```text
O(1)
```

---

# Practice Problems

Solve these in both Python and Java.

```text
1. Print square star pattern
2. Print right triangle star pattern
3. Print number triangle pattern
4. Print reverse triangle star pattern
5. Print square number pattern
```

---

# LeetCode Practice Problems for Day 4

Pattern problems are not very common on LeetCode, but nested-loop thinking is useful for beginner array and string problems.

These problems help practice loops, nested loops, and basic traversal.

## Recommended Problems

| No. | LeetCode Problem | Link | Main Concept |
|---|---|---|---|
| 1 | 1672. Richest Customer Wealth | https://leetcode.com/problems/richest-customer-wealth/ | Nested loops / 2D array |
| 2 | 1431. Kids With the Greatest Number of Candies | https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/ | Loop + comparison |
| 3 | 2114. Maximum Number of Words Found in Sentences | https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/ | Loop through strings |
| 4 | 1470. Shuffle the Array | https://leetcode.com/problems/shuffle-the-array/ | Array traversal |
| 5 | 1920. Build Array from Permutation | https://leetcode.com/problems/build-array-from-permutation/ | Array indexing |

---

## Best Problems to Solve First

For my current Day 4 level, I will start with these problems:

```text
1. 1672. Richest Customer Wealth
2. 1431. Kids With the Greatest Number of Candies
3. 2114. Maximum Number of Words Found in Sentences
```

These are good beginner problems because they help me practice:

```text
loops
nested loops
comparison
basic array traversal
basic string traversal
time complexity analysis
```

---

## How I Will Solve Each Problem

For every LeetCode problem, I will write:

```text
Problem Name:
Problem Link:
Logic:
Python Solution:
Java Solution:
Time Complexity:
Space Complexity:
What I Learned:
```

---

## Day 4 Summary

Today I learned that a nested loop means a loop inside another loop.

In pattern problems:

```text
Outer loop controls rows
Inner loop controls columns
```

Nested loops are useful for:

```text
Pattern printing
Matrix problems
2D arrays
Brute force checking
Comparing values
```

A nested loop usually gives:

```text
O(n²)
```

In Python:

```text
print(..., end=" ") prints on the same line
print() moves to the next line
```

In Java:

```text
System.out.print() prints on the same line
System.out.println() moves to the next line
```

---

## Repository Goal

The goal of this repository is to learn DSA step by step using both Python and Java.

This repository will contain:

- DSA theory notes
- Python code examples
- Java code examples
- Practice problems
- LeetCode practice problems
- Time complexity analysis
- Space complexity analysis

---

## Learning Journey

```text
Day 1: Programming Basics, Python vs Java, Time Complexity, Space Complexity, Constraints
Day 2: Conditions, Comparison Operators, Logical Operators, and Basic Decision Making
Day 3: Loops, Loop Complexity, and Loop-Based Problems
Day 4: Pattern Problems and Nested Loops
Day 5: Arrays and Basic Array Problems
```

---

## Author

Created as part of my DSA preparation journey using Python and Java.
