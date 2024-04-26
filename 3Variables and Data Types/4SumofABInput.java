import java.util.Scanner;

class SumofABInput {
    public static void main(String[] args) {
        int num1, num2, sum;
        System.out.println("Enter the Value of Two Numbers = ");
        Scanner input = new Scanner(System.in);

        // input 
        System.out.print("Enter the Value of Number 1 = ");
        num1 = input.nextInt();
        System.out.print("Enter the Value of Number 2 = ");
        num2 = input.nextInt();

        // sum 
        sum = num1 + num2;
        System.out.println("Sum of Two Numbers = "+sum);

        // input close
        input.close();
    }    
}
