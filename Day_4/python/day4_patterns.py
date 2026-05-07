"""Day 4 pattern programs using nested loops."""


def square_star_pattern(n: int) -> None:
    for _ in range(n):
        for _ in range(n):
            print("*", end=" ")
        print()


def right_triangle_star_pattern(n: int) -> None:
    for i in range(1, n + 1):
        for _ in range(i):
            print("*", end=" ")
        print()


def number_triangle_pattern(n: int) -> None:
    for i in range(1, n + 1):
        for j in range(1, i + 1):
            print(j, end=" ")
        print()


def reverse_triangle_star_pattern(n: int) -> None:
    for i in range(n, 0, -1):
        for _ in range(i):
            print("*", end=" ")
        print()


def square_number_pattern(n: int) -> None:
    for i in range(1, n + 1):
        for _ in range(1, n + 1):
            print(i, end=" ")
        print()


print("Day 4 Pattern Problems")
print("1. Square star pattern")
print("2. Right triangle star pattern")
print("3. Number triangle pattern")
print("4. Reverse triangle star pattern")
print("5. Square number pattern")

choice = int(input("Choose a pattern (1-5): "))
n = int(input("Enter n: "))

if choice == 1:
    square_star_pattern(n)
elif choice == 2:
    right_triangle_star_pattern(n)
elif choice == 3:
    number_triangle_pattern(n)
elif choice == 4:
    reverse_triangle_star_pattern(n)
elif choice == 5:
    square_number_pattern(n)
else:
    print("Invalid choice")

