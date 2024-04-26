import java.util.Scanner;

class PrintSumofNNaturalNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Range to calculate the Sum of N Natural Numbers = ");
        int Range = input.nextInt();
        int sum = 0, i = 1;
        while(i <= Range){
            sum += i;
            i++;
        }
        System.out.println("Sum of First N Natural Numbers is = "+sum);
        input.close();
    }
}
