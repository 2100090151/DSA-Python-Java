# DSA Day 3 Preparation

This repository contains my Day 3 notes for learning **Data Structures and Algorithms (DSA)** using **Python and Java**.

The main goal of Day 3 is to understand **loops**, because loops are used to repeat work and solve many beginner DSA probalems.

In Day 1, I learned programming basics, Python vs Java, time complexity, space complexity, and constraints.

In Day 2, I learned conditions and decision making.

In Day 3, I am learning how to repeat tasks using loops.

---

## Day 3 Assets

- `Day3.png` - Day 3 cover image
- `DSA_Day_3.pdf` - Day 3 notes PDF (with `Day3.png` inserted as page 1)
- `python/day3_loops.py` - Combined Day 3 Python loop programs
- `java/Day3Loops.java` - Combined Day 3 Java loop programs
- `python/day3_print_numbers.py`, `python/day3_even_numbers.py`, `python/day3_sum_natural.py`, `python/day3_factorial.py`, `python/day3_count_digits.py` - Individual Python problem files
- `java/Day3PrintNumbers.java`, `java/Day3EvenNumbers.java`, `java/Day3SumNatural.java`, `java/Day3Factorial.java`, `java/Day3CountDigits.java` - Individual Java problem files

---

## Topics Covered

- What is a Loop?
- Why Loops are Important?
- For Loop
- While Loop
- For Loop vs While Loop
- Infinite Loop
- Break Statement
- Continue Statement
- Time Complexity of Loops
- Loop-Based Practice Problems
- LeetCode Practice Problems

---

## 1. What is a Loop?

A loop is used to repeat the same task again and again.

Example:

```text
Print numbers from 1 to 5
```

Without a loop, we have to write:

```text
print 1
print 2
print 3
print 4
print 5
```

This is okay for 5 numbers.

But if we want to print numbers from 1 to 100 or 1 to 1000, writing many print statements is not practical.

So we use loops.

A loop helps us repeat code easily.

---

## 2. Why Loops are Important?

Loops are very important in programming and DSA.

In DSA, we often work with multiple values.

Examples:

```text
Find the maximum number
Count even numbers
Search for a value
Calculate the sum of numbers
Print all elements
```

To solve these problems, we need to check values one by one.

That is why loops are important.

---

## 3. For Loop

A `for` loop is used when we know how many times we want to repeat something.

Example:

```text
Print numbers from 1 to 5
```

### Python Example

```python
for i in range(1, 6):
    print(i)
```

Output:

```text
1
2
3
4
5
```

Explanation:

```text
range(1, 6) gives numbers from 1 to 5.
6 is not included.
i takes one value at a time.
print(i) runs for every value.
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

Output:

```text
1
2
3
4
5
```

Explanation:

```text
int i = 1  → starting value
i <= 5     → condition
i++        → increase i by 1
```

---

## 4. While Loop

A `while` loop runs as long as the condition is true.

Use a `while` loop when the number of repetitions depends on a condition.

Think like this:

```text
While this condition is true, keep repeating.
```

### Python Example

```python
i = 1

while i <= 5:
    print(i)
    i += 1
```

Output:

```text
1
2
3
4
5
```

Explanation:

```text
i starts from 1.
The loop runs while i <= 5.
After every print, i increases by 1.
When i becomes 6, the loop stops.
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

Output:

```text
1
2
3
4
5
```

Important:

```text
Always update the loop variable.
Otherwise, the loop may never stop.
```

---

## 5. For Loop vs While Loop

| For Loop | While Loop |
|---|---|
| Used when repetitions are known | Used when repetition depends on a condition |
| Common for counting | Common for condition-based repetition |
| Example: print 1 to n | Example: repeat until input becomes valid |

Simple rule:

```text
Use for loop when you know the range.
Use while loop when you only know the stopping condition.
```

---

## 6. Infinite Loop

An infinite loop is a loop that never stops.

Example:

```python
i = 1

while i <= 5:
    print(i)
```

Here, `i` is never increased.

So the condition `i <= 5` is always true.

Correct version:

```python
i = 1

while i <= 5:
    print(i)
    i += 1
```

---

## 7. Break Statement

`break` is used to stop a loop immediately.

### Python Example

```python
for i in range(1, 6):
    if i == 3:
        break
    print(i)
```

Output:

```text
1
2
```

Explanation:

```text
When i becomes 3, break stops the loop.
So 3, 4, and 5 are not printed.
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
```

Output:

```text
1
2
```

---

## 8. Continue Statement

`continue` skips the current iteration and moves to the next iteration.

### Python Example

```python
for i in range(1, 6):
    if i == 3:
        continue
    print(i)
```

Output:

```text
1
2
4
5
```

Explanation:

```text
When i becomes 3, continue skips printing 3.
Then the loop continues with 4 and 5.
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

Output:

```text
1
2
4
5
```

---

## 9. Time Complexity of Loops

From Day 1, I learned that time complexity tells how operations grow when input size increases.

Loops directly affect time complexity.

### Single Loop

```python
for i in range(n):
    print(i)
```

If `n = 5`, the loop runs 5 times.

If `n = 100`, the loop runs 100 times.

So the time complexity is:

```text
O(n)
```

Reason:

```text
The number of operations grows with n.
```

### Nested Loop

```python
for i in range(n):
    for j in range(n):
        print(i, j)
```

Outer loop runs `n` times.

Inner loop also runs `n` times.

Total operations:

```text
n × n = n²
```

Time complexity:

```text
O(n²)
```

Note:

Nested loops are important, but I will practice pattern problems separately later.

### Loop That Divides by 2

```python
while n > 1:
    n = n // 2
```

Here, `n` is divided by 2 each time.

Time complexity:

```text
O(log n)
```

Example:

```text
16 → 8 → 4 → 2 → 1
```

---

# Practical Problems

## Problem 1: Print Numbers from 1 to N

### Logic

```text
Start from 1.
Print each number until n.
```

### Python

```python
n = int(input("Enter n: "))

for i in range(1, n + 1):
    print(i)
```

### Java

```java
import java.util.Scanner;

class Day3PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
```

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(1)
```

---

## Problem 2: Print Even Numbers from 1 to N

### Logic

```text
Check every number from 1 to n.
If number is divisible by 2, print it.
```

### Python

```python
n = int(input("Enter n: "))

for i in range(1, n + 1):
    if i % 2 == 0:
        print(i)
```

### Java

```java
import java.util.Scanner;

class Day3EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
```

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(1)
```

---

## Problem 3: Sum of First N Natural Numbers

### Logic

```text
Add all numbers from 1 to n.
```

Example:

```text
n = 5
1 + 2 + 3 + 4 + 5 = 15
```

### Python

```python
n = int(input("Enter n: "))

total = 0

for i in range(1, n + 1):
    total += i

print("Sum:", total)
```

### Java

```java
import java.util.Scanner;

class Day3SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Sum: " + total);

        sc.close();
    }
}
```

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(1)
```

---

## Problem 4: Factorial of a Number

Factorial means multiplying numbers from 1 to n.

Example:

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

### Python

```python
n = int(input("Enter n: "))

fact = 1

for i in range(1, n + 1):
    fact *= i

print("Factorial:", fact)
```

### Java

```java
import java.util.Scanner;

class Day3Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);

        sc.close();
    }
}
```

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(1)
```

---

## Problem 5: Count Digits in a Number

### Logic

Keep dividing the number by 10 until it becomes 0.

Example:

```text
12345 → 1234 → 123 → 12 → 1 → 0
```

So the number has 5 digits.

### Python

```python
n = int(input("Enter number: "))

count = 0

if n == 0:
    count = 1
else:
    while n > 0:
        count += 1
        n = n // 10

print("Digits:", count)
```

### Java

```java
import java.util.Scanner;

class Day3CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
        }

        System.out.println("Digits: " + count);

        sc.close();
    }
}
```

Time Complexity:

```text
O(log n)
```

Space Complexity:

```text
O(1)
```

Reason:

```text
The number is divided by 10 each time.
So the loop runs based on the number of digits.
```

---

# LeetCode Practice Problems for Day 3

These problems are related to loops and loop-based thinking.

## Recommended Problems

| No. | LeetCode Problem | Main Concept |
|---|---|---|
| 1 | 1342. Number of Steps to Reduce a Number to Zero | While loop |
| 2 | 412. Fizz Buzz | Loop + conditions |
| 3 | 258. Add Digits | Repeated digit logic |
| 4 | 1295. Find Numbers with Even Number of Digits | Count digits |
| 5 | 1480. Running Sum of 1d Array | Loop through array |

### Beginner-Friendly LeetCode Links

I also added beginner-friendly LeetCode problems for Day 3:

🟢 1342. Number of Steps to Reduce a Number to Zero  
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

🟢 412. Fizz Buzz  
https://leetcode.com/problems/fizz-buzz/

🟢 1295. Find Numbers with Even Number of Digits  
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

🟢 258. Add Digits  
https://leetcode.com/problems/add-digits/

🟢 1480. Running Sum of 1d Array  
https://leetcode.com/problems/running-sum-of-1d-array/

---

## Best Problems to Solve First

For my current Day 3 level, I will start with these problems:

```text
1. 1342. Number of Steps to Reduce a Number to Zero
2. 412. Fizz Buzz
3. 1295. Find Numbers with Even Number of Digits
```

These are good beginner problems because they help me practice:

```text
for loop
while loop
conditions inside loops
counting
updating values
time complexity of loops
```

---

## How I Will Solve Each Problem

For every LeetCode problem, I will write:

```text
Problem Name:
Logic:
Python Solution:
Java Solution:
Time Complexity:
Space Complexity:
What I Learned:
```

---

## Day 3 Summary

Today I learned that loops help repeat code.

A `for` loop is useful when repetitions are known.

A `while` loop is useful when repetition depends on a condition.

An infinite loop happens when the stopping condition never becomes false.

`break` stops a loop immediately.

`continue` skips the current iteration.

A single loop usually gives:

```text
O(n)
```

A nested loop usually gives:

```text
O(n²)
```

A loop that divides the input repeatedly usually gives:

```text
O(log n)
```

---

## Repository Goal

The goal of this repository is to learn DSA step by step using both Python and Java.

This repository will contain:

- DSA theory notes
- Python code examples
- Java code examples
- Practice problems
- Time complexity analysis
- Space complexity analysis

---

## Learning Journey

```text
Day 1: Programming Basics, Python vs Java, Time Complexity, Space Complexity, Constraints
Day 2: Conditions, Comparison Operators, Logical Operators, and Basic Decision Making
Day 3: Loops, Loop Complexity, and Loop-Based Problems
Day 4: Pattern Problems and Nested Loops
```

---

## Author

Created as part of my DSA preparation journey using Python and Java.
