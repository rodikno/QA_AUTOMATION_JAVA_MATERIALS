package example.stacks;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("First Item");
        stack.push("Second Item");
        stack.push("Third Item");

        System.out.println("Stack after push operations: " + stack);

        String removedItem = stack.pop();
        System.out.println("Removed top element: " + removedItem);

        System.out.println("Stack after pop operation: " + stack);
    }
}
