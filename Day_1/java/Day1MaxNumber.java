/*
Day 1 small program (Java):
Find the maximum number in a list using a linear scan.
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class Day1MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive size.");
            sc.close();
            return;
        }

        int maximum = Integer.MIN_VALUE;
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value > maximum) {
                maximum = value;
            }
        }

        System.out.println("Maximum value: " + maximum);
        sc.close();
    }
}
