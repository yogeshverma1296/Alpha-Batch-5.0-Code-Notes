import java.util.Scanner;

class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income = ");
        int income = sc.nextInt();
        int tax = 0;

        if(income<500000){
            tax = 0;
        }else if(income>=500000 && income < 1000000){
            tax = (int)(income*0.2);
        }else if(income>=1000000){
            tax = (int)(income*0.3);
        }else{
            System.out.println("Enter Correct Income Details!");
        }
        System.out.println("Tax is = "+tax+" for Income = "+income);
        sc.close();
    }
}
