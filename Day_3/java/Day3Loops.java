import java.util.Scanner;

public class Day3Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day 3 Loop Problems");
        System.out.println("1. Print numbers from 1 to N");
        System.out.println("2. Print even numbers from 1 to N");
        System.out.println("3. Sum of first N natural numbers");
        System.out.println("4. Factorial of a number");
        System.out.println("5. Count digits in a number");
        System.out.print("Choose a problem (1-5): ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        } else if (choice == 2) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (choice == 3) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int total = 0;
            for (int i = 1; i <= n; i++) {
                total += i;
            }
            System.out.println("Sum: " + total);
        } else if (choice == 4) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        } else if (choice == 5) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            n = Math.abs(n);
            int count = 0;
            if (n == 0) {
                count = 1;
            } else {
                while (n > 0) {
                    count++;
                    n /= 10;
                }
            }
            System.out.println("Digits: " + count);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

