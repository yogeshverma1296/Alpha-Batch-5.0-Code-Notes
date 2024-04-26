import java.util.Scanner;

public class SumofNaturalNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Number = ");
        int N = input.nextInt();
        int sum = 0;
        // Loop to calculate sum of N Natural Numbers ->
        for(int i = 1 ; i<=N ; i++){
            sum += i;
        }
        System.out.println("Sum of N Natural Numbers = "+sum);
        input.close();
    }    
}
