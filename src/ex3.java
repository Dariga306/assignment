import java.util.Scanner;
import java.util.Stack;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Stack<Integer> shelf = new Stack<>();

        for (int i = 0; i < n; i++) {
            int operation = scanner.nextInt();
            if (operation == 1 || operation == 2) {
                int diskNumber = scanner.nextInt();
                if (operation == 1) {
                    shelf.push(diskNumber);
                } else {
                    shelf.add(diskNumber);
                }
            } else { // Removing a disk
                int removedDisk = shelf.pop();
                System.out.println(removedDisk);
            }
        }
        scanner.close();
    }
}
