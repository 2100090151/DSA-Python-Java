# DSA Day 2 Preparation

This repository contains my Day 2 notes for learning **Data Structures and Algorithms (DSA)** using **Python and Java**.

The main goal of Day 2 is to understand **conditions and decision making** in programming.

In Day 1, I learned programming basics, Python vs Java, time complexity, space complexity, and constraints.

In Day 2, I am learning how a program makes decisions using conditions.

---

## Day 2 Assets

- `Day2.png` - Day 2 cover image
- `DSA_Day_2.pdf` - Day 2 notes PDF (with `Day2.png` inserted as page 1)
- `python/day2_conditions.py` - Combined Day 2 Python condition programs
- `java/Day2Conditions.java` - Combined Day 2 Java condition programs
- `python/day2_even_odd.py`, `python/day2_pass_fail.py`, `python/day2_voting_eligibility.py`, `python/day2_largest_two.py`, `python/day2_positive_negative_zero.py` - Individual Python problem files
- `java/Day2EvenOdd.java`, `java/Day2PassFail.java`, `java/Day2VotingEligibility.java`, `java/Day2LargestTwo.java`, `java/Day2PositiveNegativeZero.java` - Individual Java problem files

---

## Topics Covered

- What is Control Flow?
- What is a Condition?
- Why Conditions are Important?
- Comparison Operators
- If Statement
- If-Else Statement
- If-Elif-Else in Python
- If-Else If-Else in Java
- Logical Operators
  - AND
  - OR
  - NOT
- Condition-Based Practice Problems
- Time and Space Complexity of Condition Problems

---

## 1. What is Control Flow?

Control flow means the order in which a program runs.

Normally, a program runs from top to bottom.

Example:

```text
Step 1: Start
Step 2: Take input
Step 3: Process data
Step 4: Print output
Step 5: End
```

But sometimes, we do not want every line to run.

Sometimes the program must make a decision.

Example:

```text
If marks are greater than or equal to 35, print Pass.
Otherwise, print Fail.
```

For this type of decision making, we use conditions.

---

## 2. What is a Condition?

A condition is a statement that gives only one of two results:

```text
True or False
```

Example:

```text
age >= 18
```

If age is 20:

```text
20 >= 18 → True
```

If age is 15:

```text
15 >= 18 → False
```

So a condition is like a question asked by the program.

Examples:

```text
Is age greater than or equal to 18?
Is marks greater than or equal to 35?
Is number divisible by 2?
Is a greater than b?
```

The answer is always either true or false.

---

## 3. Why Conditions are Important?

Without conditions, a program cannot make decisions.

Example:

A voting program should not give the same output for every person.

If age is 20:

```text
Eligible to vote
```

If age is 15:

```text
Not eligible to vote
```

So conditions help a program behave differently for different inputs.

In DSA also, conditions are used everywhere.

Examples:

```text
Check if a number is even or odd
Check if an array element is greater than another element
Check if a target value is found
Check if a number is positive, negative, or zero
```

---

## 4. Comparison Operators

Comparison operators are used to compare two values.

| Operator | Meaning | Example | Result |
|---|---|---|---|
| `==` | Equal to | `10 == 10` | True |
| `!=` | Not equal to | `10 != 5` | True |
| `>` | Greater than | `10 > 5` | True |
| `<` | Less than | `10 < 5` | False |
| `>=` | Greater than or equal to | `10 >= 10` | True |
| `<=` | Less than or equal to | `5 <= 10` | True |

Important difference:

```text
=  means assignment
== means comparison
```

Example:

```python
age = 20
```

This stores the value `20` in the variable `age`.

```python
age == 20
```

This checks whether `age` is equal to `20`.

---

## 5. If Statement

An `if` statement is used to run code only when a condition is true.

Think like this:

```text
If this condition is true, then do this work.
```

Example:

```text
If age is 18 or above, print Eligible to vote.
```

### Python Example

```python
age = 20

if age >= 18:
    print("Eligible to vote")
```

Output:

```text
Eligible to vote
```

Explanation:

```text
age = 20
condition: age >= 18
20 >= 18 is True
So the print statement runs
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
    }
}
```

Output:

```text
Eligible to vote
```

Explanation:

```text
age = 20
condition: age >= 18
20 >= 18 is true
So the print statement runs
```

---

## 6. If-Else Statement

The `if-else` statement is used when there are two possible results.

Think like this:

```text
If condition is true, do this.
Otherwise, do that.
```

Example:

```text
If marks are 35 or more, print Pass.
Otherwise, print Fail.
```

### Python Example

```python
marks = 30

if marks >= 35:
    print("Pass")
else:
    print("Fail")
```

Output:

```text
Fail
```

Explanation:

```text
marks = 30
condition: marks >= 35
30 >= 35 is False
So the else block runs
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        int marks = 30;

        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
```

Output:

```text
Fail
```

---

## 7. If-Elif-Else in Python

`if-elif-else` is used when there are more than two conditions.

Example:

```text
If marks >= 90 → Grade A
Else if marks >= 75 → Grade B
Else if marks >= 60 → Grade C
Otherwise → Grade D
```

### Python Example

```python
marks = 85

if marks >= 90:
    print("Grade A")
elif marks >= 75:
    print("Grade B")
elif marks >= 60:
    print("Grade C")
else:
    print("Grade D")
```

Output:

```text
Grade B
```

Explanation:

```text
marks = 85
85 >= 90 is False
85 >= 75 is True
So Grade B is printed
```

---

## 8. If-Else If-Else in Java

In Java, we use `else if` for multiple conditions.

### Java Example

```java
class Main {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
```

Output:

```text
Grade B
```

---

## 9. Logical Operators

Sometimes one condition is not enough.

Example:

```text
A student is allowed for exam only if:
marks >= 35
and
attendance >= 75
```

Here, two conditions are used together.

Logical operators are used to combine conditions.

| Meaning | Python | Java | Use |
|---|---|---|---|
| AND | `and` | `&&` | Both conditions must be true |
| OR | `or` | `||` | At least one condition must be true |
| NOT | `not` | `!` | Reverses the result |

---

## 10. AND Operator

AND means both conditions must be true.

Example:

```text
marks >= 35 AND attendance >= 75
```

### Python Example

```python
marks = 80
attendance = 90

if marks >= 35 and attendance >= 75:
    print("Allowed for exam")
else:
    print("Not allowed")
```

Output:

```text
Allowed for exam
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        int marks = 80;
        int attendance = 90;

        if (marks >= 35 && attendance >= 75) {
            System.out.println("Allowed for exam");
        } else {
            System.out.println("Not allowed");
        }
    }
}
```

Output:

```text
Allowed for exam
```

---

## 11. OR Operator

OR means at least one condition must be true.

Example:

```text
If it is Sunday OR it is a holiday, then no college.
```

### Python Example

```python
is_sunday = True
is_holiday = False

if is_sunday or is_holiday:
    print("No college")
else:
    print("Go to college")
```

Output:

```text
No college
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        boolean isSunday = true;
        boolean isHoliday = false;

        if (isSunday || isHoliday) {
            System.out.println("No college");
        } else {
            System.out.println("Go to college");
        }
    }
}
```

Output:

```text
No college
```

---

## 12. NOT Operator

NOT reverses the result.

If a condition is true, NOT makes it false.

If a condition is false, NOT makes it true.

### Python Example

```python
is_raining = False

if not is_raining:
    print("Go outside")
else:
    print("Stay inside")
```

Output:

```text
Go outside
```

### Java Example

```java
class Main {
    public static void main(String[] args) {
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("Go outside");
        } else {
            System.out.println("Stay inside");
        }
    }
}
```

Output:

```text
Go outside
```

---

# Practical Problems

## Problem 1: Check Even or Odd

### Logic

```text
If number is divisible by 2, it is even.
Otherwise, it is odd.
```

Condition:

```text
number % 2 == 0
```

### Python

```python
num = int(input("Enter a number: "))

if num % 2 == 0:
    print("Even")
else:
    print("Odd")
```

### Java

```java
import java.util.Scanner;

class Day2EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
```

Time Complexity:

```text
O(1)
```

Space Complexity:

```text
O(1)
```

Reason:

```text
Only one condition is checked.
No loop is used.
Extra memory does not grow with input.
```

---

## Problem 2: Check Pass or Fail

### Logic

```text
If marks are 35 or more, student passes.
Otherwise, student fails.
```

### Python

```python
marks = int(input("Enter marks: "))

if marks >= 35:
    print("Pass")
else:
    print("Fail")
```

### Java

```java
import java.util.Scanner;

class Day2PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
```

Time Complexity:

```text
O(1)
```

Space Complexity:

```text
O(1)
```

---

## Problem 3: Voting Eligibility

### Logic

```text
If age is 18 or more, person is eligible to vote.
Otherwise, person is not eligible to vote.
```

### Python

```python
age = int(input("Enter age: "))

if age >= 18:
    print("Eligible to vote")
else:
    print("Not eligible to vote")
```

### Java

```java
import java.util.Scanner;

class Day2VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        sc.close();
    }
}
```

Time Complexity:

```text
O(1)
```

Space Complexity:

```text
O(1)
```

---

## Problem 4: Find Largest of Two Numbers

### Logic

```text
If first number is greater than second number, first is largest.
Otherwise, second is largest.
```

### Python

```python
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

if a > b:
    print("Largest:", a)
else:
    print("Largest:", b)
```

### Java

```java
import java.util.Scanner;

class Day2LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest: " + a);
        } else {
            System.out.println("Largest: " + b);
        }

        sc.close();
    }
}
```

Time Complexity:

```text
O(1)
```

Space Complexity:

```text
O(1)
```

---

## Problem 5: Positive, Negative, or Zero

### Logic

```text
If number > 0 → Positive
If number < 0 → Negative
Otherwise → Zero
```

### Python

```python
num = int(input("Enter a number: "))

if num > 0:
    print("Positive")
elif num < 0:
    print("Negative")
else:
    print("Zero")
```

### Java

```java
import java.util.Scanner;

class Day2PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
```

Time Complexity:

```text
O(1)
```

Space Complexity:

```text
O(1)
```

---

## Day 2 LeetCode Practice (Conditions Focus)

These beginner-friendly LeetCode problems match Day 2 topics:

| No. | Problem | Why it matches Day 2 |
|---|---|---|
| 1 | 2235. Add Two Integers | Very basic input/output logic |
| 2 | 2413. Smallest Even Multiple | Uses even/odd condition |
| 3 | 2469. Convert the Temperature | Simple formula practice |
| 4 | 1523. Count Odd Numbers in an Interval Range | Odd/even condition thinking |
| 5 | 1281. Subtract the Product and Sum of Digits of an Integer | Basic math and condition-style thinking |
| 6 | 9. Palindrome Number | Good condition-based beginner problem |
| 7 | 263. Ugly Number | Uses conditions and divisibility checks |
| 8 | 412. Fizz Buzz | Best for if, else if, else, and logical checks |
| 9 | 2124. Check if All A's Appears Before All B's | Good true/false condition thinking |
| 10 | 367. Valid Perfect Square | Condition-based checking |

### Start First (Exact Day 2 Level)

1. 2235. Add Two Integers
2. 2413. Smallest Even Multiple
3. 1523. Count Odd Numbers in an Interval Range
4. 412. Fizz Buzz
5. 9. Palindrome Number

### Practice Order

Level 1: Very Easy
1. 2235. Add Two Integers
2. 2469. Convert the Temperature
3. 2413. Smallest Even Multiple

Level 2: Conditions
1. 1523. Count Odd Numbers in an Interval Range
2. 412. Fizz Buzz

Level 3: Slightly More Thinking
1. 9. Palindrome Number
2. 263. Ugly Number
3. 2124. Check if All A's Appears Before All B's

### Recommendation for Today

Solve only these 3 problems today:

1. 2235. Add Two Integers
2. 2413. Smallest Even Multiple
3. 412. Fizz Buzz

For every problem, write:

- Logic
- Time Complexity
- Space Complexity
- Python Solution
- Java Solution

---

## Day 2 Summary

Today I learned that conditions help a program make decisions.

A condition always gives either true or false.

Comparison operators are used to compare values.

`if` runs when a condition is true.

`else` runs when the condition is false.

`elif` in Python and `else if` in Java are used for multiple conditions.

Logical operators are used to combine conditions.

```text
AND → both conditions must be true
OR  → at least one condition must be true
NOT → reverses the result
```

Condition-based problems usually have:

```text
Time Complexity: O(1)
Space Complexity: O(1)
```

because they do not use loops and memory does not grow with input size.

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

```

---

## Author

Created as part of my DSA preparation journey using Python and Java.
