"""Pattern 2: Right triangle star pattern."""

n = int(input("Enter n: "))

for i in range(1, n + 1):
    for _ in range(i):
        print("*", end=" ")
    print()

