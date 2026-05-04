"""
Day 1 small program (Python):
Find the maximum number in a list using a linear scan.
Time Complexity: O(n)
Space Complexity: O(1)
"""

n = int(input("Enter number of elements: "))
arr = list(map(int, input(f"Enter {n} integers: ").split()))

if len(arr) != n:
    print("Input count mismatch.")
else:
    maximum = arr[0]
    for value in arr:
        if value > maximum:
            maximum = value
    print("Maximum value:", maximum)
