import java.util.Scanner;

public class fibonaccis {
    public static void main(String[] args) {
        int num, a = 0, b = 1, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.print("Fibonacci series up to " + num + ": ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
