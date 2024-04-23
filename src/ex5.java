import java.util.ArrayDeque;
import java.util.Deque;

public class ex5 {
    public static void main(String[] args) {
        int[] students1 = {1, 1, 0, 0};
        int[] samsas1 = {0, 1, 0, 1};
        System.out.println("Output for input 1: " + countUnsatisfiedStudents(students1, samsas1));

        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] samsas2 = {1, 0, 0, 0, 1, 1};
        System.out.println("Output for input 2: " + countUnsatisfiedStudents(students2, samsas2));
    }

    public static int countUnsatisfiedStudents(int[] students, int[] samsas) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int student : students) {
            queue.offer(student);
        }

        int unsatisfiedStudents = 0;
        int idx = 0;
        while (!queue.isEmpty() && idx < samsas.length) {
            if (queue.peek() == samsas[idx]) {
                queue.poll();
                idx++;
                unsatisfiedStudents = 0;
            } else {
                int student = queue.poll();
                queue.offer(student);
                unsatisfiedStudents++;
                if (unsatisfiedStudents == queue.size()) {
                    break;
                }
            }
        }

        return queue.size();
    }
}
