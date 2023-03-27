import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
}
