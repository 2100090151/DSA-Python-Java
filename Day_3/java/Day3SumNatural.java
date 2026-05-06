import java.util.Scanner;

public class Day3SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Sum: " + total);
        sc.close();
    }
}

