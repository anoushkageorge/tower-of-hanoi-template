import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
    }

    public int pop() {
        return stack.isEmpty() ? 0 : stack.pop();
    }

    public int get(int index) {
        return index < stack.size() ? stack.get(index) : 0;
    }

    public int peek() {
        return stack.isEmpty() ? 0 : stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
