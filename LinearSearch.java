import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        int target;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        target = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at index " + i);
                return;
            }
        }
        System.out.println(target + " not found in the array.");
    }
}
