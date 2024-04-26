import java.util.Scanner;

class Largestof3Alt {
    public static void main(String[] args) {
        // input part
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Enter Value of n1 = ");
        n1 = sc.nextInt();
        System.out.println("Enter Value of n2 = ");
        n2 = sc.nextInt();
        System.out.println("Enter Value of n3 = ");
        n3 = sc.nextInt();

        // conditional statements part
        if((n1 >= n2) && (n1 >= n3)){
            System.out.println("n1 is the Greatest or Largest = n1 = "+n1);
        }else if (n2 >= n3) {
            System.out.println("n2 is the Greatest or Largest = n2 = "+n2);
        }else{
            System.out.println("n3 is the Greatest or Largest = n3 = "+n3);
        }

        sc.close();
    }
}
