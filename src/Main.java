import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for(int i=0; i<n; i++){
            int d = scanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            for(int j=0; j<d; j++){
                numbers.add(scanner.nextInt());
            }
            lines.add(numbers);
        }

        int q = scanner.nextInt();

        for(int i=0; i<q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x <= lines.size() && y <= lines.get(x-1).size()){
                System.out.println(lines.get(x-1).get(y-1));
            } else {
                System.out.println("error!");
            }
        }
    }
}