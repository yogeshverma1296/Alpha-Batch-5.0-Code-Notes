import java.util.Scanner;

class ReverseofNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Number = ");
        int Number = input.nextInt();
        int rev = 0;
        while (Number != 0) {
            rev = rev * 10 + Number % 10;
            Number = Number / 10;
        }
        System.out.println("Reverse of Number is = "+rev);
        input.close();
    }
}
