import java.util.Scanner;

public class Day2Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day 2 Condition Problems");
        System.out.println("1. Even or Odd");
        System.out.println("2. Pass or Fail");
        System.out.println("3. Voting Eligibility");
        System.out.println("4. Largest of Two Numbers");
        System.out.println("5. Positive, Negative, or Zero");
        System.out.print("Choose a problem (1-5): ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else if (choice == 2) {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            if (marks >= 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else if (choice == 3) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        } else if (choice == 4) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            if (a > b) {
                System.out.println("Largest: " + a);
            } else {
                System.out.println("Largest: " + b);
            }
        } else if (choice == 5) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0) {
                System.out.println("Positive");
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

