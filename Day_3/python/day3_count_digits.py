"""Problem 5: Count digits in a number."""

n = int(input("Enter number: "))
n = abs(n)

count = 0
if n == 0:
    count = 1
else:
    while n > 0:
        count += 1
        n = n // 10

print("Digits:", count)

