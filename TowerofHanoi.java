import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        numDisks = input.nextInt();
        solveTowerOfHanoi(numDisks, 'A', 'B', 'C');
    }
    
    public static void solveTowerOfHanoi(int numDisks, char fromRod, char toRod, char auxRod) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        solveTowerOfHanoi(numDisks - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + numDisks + " from rod " + fromRod + " to rod " + toRod);
        solveTowerOfHanoi(numDisks - 1, auxRod, toRod, fromRod);
    }
}
