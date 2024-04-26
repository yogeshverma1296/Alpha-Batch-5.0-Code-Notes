import java.util.Scanner;

class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of Number = ");
        int Number = sc.nextInt();
        if(Number % 2 == 0){
            System.out.println("Number is Even, Number is = "+Number);
        }else{
            System.out.println("Number is Odd, Number is = "+Number);
        }
        sc.close();
    }
}
