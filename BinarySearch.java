import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 10, 13, 15, 18, 20 };
        int target, left = 0, right = arr.length - 1, mid;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        target = input.nextInt();
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println(target + " found at index " + mid);
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left > right) {
            System.out.println(target + " not found in the array.");
        }
    }
}
