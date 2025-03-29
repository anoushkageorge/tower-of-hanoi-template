public class IntegerStack {
    private int[] stack;
    private int top;

    public IntegerStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top < stack.length - 1) {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return 0; // Empty stack case
    }

    public int peek() {
        if (top >= 0) {
            return stack[top];
        }
        return 0; // Empty stack case
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int get(int index) {
        if (index >= 0 && index <= top) {
            return stack[index];
        }
        return 0;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
