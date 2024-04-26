import java.util.Scanner;

class CalculatorusingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input 2 No.
        System.out.println("Enter the Value of Number 1 = ");
        int Number1 = input.nextInt();
        System.out.println("Enter the Value of Number 2 = ");
        int Number2 = input.nextInt();

        // Input Choice 
        System.out.println("Enter your Choice = ");
        System.out.print("1 for Addition \n2 for Subtraction \n3 for Multiplication \n4 for Division \n5 for Modulous(Remainder) = ");
        int Choice = input.nextInt();

        // Switch Statement
        switch (Choice) {
            case 1:
                System.out.println("Addition of Two Numbers is = "+(Number1+Number2));
                break;
            case 2:
                System.out.println("Subtraction of Two Numbers is = "+(Number1-Number2));
                break;
            case 3:
                System.out.println("Multiplication of Two Numbers is = "+(Number1*Number2));
                break;
            case 4:
                System.out.println("Division of Two Numbers is = "+(Number1/Number2));
                break;
            case 5:
                System.out.println("Modulous(Remainder) of Two Numbers is = "+(Number1%Number2));
                break;
            default:
                System.out.println("Enter Choice from 1 to 5 Only!");
                break;
        }

        input.close();
    }
}
