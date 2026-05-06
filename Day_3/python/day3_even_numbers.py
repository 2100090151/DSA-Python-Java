"""Problem 2: Print even numbers from 1 to N."""

n = int(input("Enter n: "))

for i in range(1, n + 1):
    if i % 2 == 0:
        print(i)

