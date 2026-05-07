"""Pattern 1: Square star pattern."""

n = int(input("Enter n: "))

for _ in range(n):
    for _ in range(n):
        print("*", end=" ")
    print()

