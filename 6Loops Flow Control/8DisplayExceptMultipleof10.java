//Display all numbers entered by user except multipes of 10

import java.util.Scanner;

class DisplayExceptMultipleof10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the Number = ");
            int N = input.nextInt();

            if (N % 10 == 0) {
                continue;
            }

            System.out.println("Number is = "+N);
        }
    }
}
