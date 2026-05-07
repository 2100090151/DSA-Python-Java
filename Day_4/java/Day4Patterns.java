import java.util.Scanner;

public class Day4Patterns {
    static void squareStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightTriangleStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numberTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void reverseTriangleStarPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void squareNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Day 4 Pattern Problems");
        System.out.println("1. Square star pattern");
        System.out.println("2. Right triangle star pattern");
        System.out.println("3. Number triangle pattern");
        System.out.println("4. Reverse triangle star pattern");
        System.out.println("5. Square number pattern");
        System.out.print("Choose a pattern (1-5): ");
        int choice = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (choice == 1) {
            squareStarPattern(n);
        } else if (choice == 2) {
            rightTriangleStarPattern(n);
        } else if (choice == 3) {
            numberTrianglePattern(n);
        } else if (choice == 4) {
            reverseTriangleStarPattern(n);
        } else if (choice == 5) {
            squareNumberPattern(n);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

