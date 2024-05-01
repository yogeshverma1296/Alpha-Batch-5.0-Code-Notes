//Java Program to use Optimized Approach to solve Prime Number Problem

import java.util.Scanner;

class OptimizedPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value of Number = ");
        int N = input.nextInt();
        boolean isPrime = true;
        // Edge Cases
        if(N < 2){
            isPrime = false;
        }
        // N > 2 Cases
        for(int i = 2; i <= Math.sqrt(N) + 1; i++){
            if(N % i == 0){
                isPrime = false;
                break; // No need to continue checking
            }
        }

        // Printing the Output ->
        if (isPrime) {
            System.out.println("Number is a Prime Number = "+N);
        }else{
            System.out.println("Number is Not a Prime Number = "+N);
        }

        input.close();
    }
}