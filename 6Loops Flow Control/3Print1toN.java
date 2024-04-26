import java.util.Scanner;

class Print1toN {
    public static void main(String[] args) {
        System.out.println("Enter the Range = ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println("Printing 1 to "+N);
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }
        input.close();
    }
}