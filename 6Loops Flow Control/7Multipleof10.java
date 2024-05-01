// Keep entering numbers till user enters a multiple of 10.

import java.util.Scanner;

class Multipleof10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value = ");

        while(true){
            int N = input.nextInt();
            if(N % 10 == 0){
                System.out.println("Number "+N+" is a Multiple of 10.");
                break;
            }
            System.out.println("Number you entered is = "+N);
        }

        input.close();
    }
}
