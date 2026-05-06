"""Day 3 loop-based practice programs."""


def print_1_to_n():
    n = int(input("Enter n: "))
    for i in range(1, n + 1):
        print(i)


def print_even_1_to_n():
    n = int(input("Enter n: "))
    for i in range(1, n + 1):
        if i % 2 == 0:
            print(i)


def sum_first_n():
    n = int(input("Enter n: "))
    total = 0
    for i in range(1, n + 1):
        total += i
    print("Sum:", total)


def factorial_n():
    n = int(input("Enter n: "))
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    print("Factorial:", fact)


def count_digits():
    n = int(input("Enter number: "))
    n = abs(n)
    count = 0
    if n == 0:
        count = 1
    else:
        while n > 0:
            count += 1
            n //= 10
    print("Digits:", count)


print("Day 3 Loop Problems")
print("1. Print numbers from 1 to N")
print("2. Print even numbers from 1 to N")
print("3. Sum of first N natural numbers")
print("4. Factorial of a number")
print("5. Count digits in a number")

choice = int(input("Choose a problem (1-5): "))

if choice == 1:
    print_1_to_n()
elif choice == 2:
    print_even_1_to_n()
elif choice == 3:
    sum_first_n()
elif choice == 4:
    factorial_n()
elif choice == 5:
    count_digits()
else:
    print("Invalid choice")

