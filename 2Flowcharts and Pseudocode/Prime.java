import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Number = ");
        int N = input.nextInt();
        boolean isPrime = true;
        // Prime check
        if(N<2){
            System.out.println(N+" is Not a Prime Number");
        }
        else{
            for(int i = 2 ; i < N ; i++){
                if(N % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        // Print Prime or Not
        if(isPrime){
            System.out.println(N+ " is a Prime Number");
        }else{
            System.out.println(N + " is Not a Prime Number");
        }

        input.close();
    }  
} 
