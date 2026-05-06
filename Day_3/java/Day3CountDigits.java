import java.util.Scanner;

public class Day3CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        sc.close();
    }
}

