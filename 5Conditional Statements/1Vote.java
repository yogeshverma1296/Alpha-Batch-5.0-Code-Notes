import java.util.Scanner;

class Vote{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your Age = ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible to Vote, Age is = "+age);
        }else{
            System.out.println("Not eligible to Vote, Age is = "+age);
        }
        sc.close();
    }
}