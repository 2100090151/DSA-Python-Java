"""Pattern 4: Reverse triangle star pattern."""

n = int(input("Enter n: "))

for i in range(n, 0, -1):
    for _ in range(i):
        print("*", end=" ")
    print()

