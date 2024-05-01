//Check if a number is Prime or Not!

import java.util.Scanner;

class PrimeorNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program to check if a Number is Prime or Not!");
        System.out.print("Enter the Value of Number = ");
        boolean isPrime = true;
        int N = input.nextInt();
        //Prime Logic ->
        for(int i = 2 ; i < N ; i++){
            if(N % i == 0){
                isPrime = false;
                break;
            }
        }
        // Printing Prime Logic ->
        if (isPrime) {
            System.out.println("Number is a Prime Number = "+N);
        }else{
            System.out.println("Number is Not a Prime Number = "+N);
        }

        input.close();
    }    
}
