import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input 2 No.
        System.out.println("Enter the Value of Number 1 = ");
        int Number1 = input.nextInt();
        System.out.println("Enter the Value of Number 2 = ");
        int Number2 = input.nextInt();

        // Input Choice 
        System.out.println("Choice you can enter is +, -, *, /, % for Operations.");
        System.out.print("Enter your Choice = ");
        char Choice = input.next().charAt(0);

        // Switch Statement
        switch (Choice) {
            case '+':
                System.out.println("Addition of Two Numbers is = "+(Number1+Number2));
                break;
            case '-':
                System.out.println("Subtraction of Two Numbers is = "+(Number1-Number2));
                break;
            case '*':
                System.out.println("Multiplication of Two Numbers is = "+(Number1*Number2));
                break;
            case '/':
                System.out.println("Division of Two Numbers is = "+(Number1/Number2));
                break;
            case '%':
                System.out.println("Modulous(Remainder) of Two Numbers is = "+(Number1%Number2));
                break;
            default:
                System.out.println("Enter Correct Symbol!");
                break;
        }
        
        input.close();
    }
}
