"""Pattern 5: Square number pattern."""

n = int(input("Enter n: "))

for i in range(1, n + 1):
    for _ in range(1, n + 1):
        print(i, end=" ")
    print()

