"""Day 2 conditions practice: run one of 5 basic condition problems."""


def problem1_even_odd():
    num = int(input("Enter a number: "))
    if num % 2 == 0:
        print("Even")
    else:
        print("Odd")


def problem2_pass_fail():
    marks = int(input("Enter marks: "))
    if marks >= 35:
        print("Pass")
    else:
        print("Fail")


def problem3_voting():
    age = int(input("Enter age: "))
    if age >= 18:
        print("Eligible to vote")
    else:
        print("Not eligible to vote")


def problem4_largest_two():
    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    if a > b:
        print("Largest:", a)
    else:
        print("Largest:", b)


def problem5_sign_check():
    num = int(input("Enter a number: "))
    if num > 0:
        print("Positive")
    elif num < 0:
        print("Negative")
    else:
        print("Zero")


print("Day 2 Condition Problems")
print("1. Even or Odd")
print("2. Pass or Fail")
print("3. Voting Eligibility")
print("4. Largest of Two Numbers")
print("5. Positive, Negative, or Zero")

choice = int(input("Choose a problem (1-5): "))

if choice == 1:
    problem1_even_odd()
elif choice == 2:
    problem2_pass_fail()
elif choice == 3:
    problem3_voting()
elif choice == 4:
    problem4_largest_two()
elif choice == 5:
    problem5_sign_check()
else:
    print("Invalid choice")

