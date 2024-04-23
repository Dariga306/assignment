import java.util.Stack;

public class ex4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);


        reverseStack(stack);

        System.out.println("Reversed stack:");
        printStack(stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();

            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);

            stack.push(temp);
        }
    }

    public static void printStack(Stack<Integer> stack) {
        for (Integer item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
