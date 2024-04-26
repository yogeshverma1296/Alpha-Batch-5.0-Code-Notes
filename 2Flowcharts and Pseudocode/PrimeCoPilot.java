import java.util.Scanner;

public class PrimeCoPilot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N = input.nextInt();
        input.close();

        if (N < 2) {
            System.out.println(N + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }
    }
}
