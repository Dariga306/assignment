import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = scanner.nextLine().trim();
            if (operation.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else if (operation.equals("Delete")) {
                int x = scanner.nextInt();
                if (x >= 0 && x < list.size()) {
                    list.remove(x);
                }
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
