package stacks;

public class IntegerStack {

    Integer[] stack = {};

    void push(Integer toPush) {
        Integer[] old = stack.clone();
        stack = new Integer[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            stack[i] = old[i];
        }
        stack[old.length] = toPush;
    }

    Integer pop() {
        Integer[] old = stack.clone();
        stack = new Integer[old.length - 1];
        for (int i = 0; i < stack.length; i++) {
            stack[i] = old[i];
        }
        return old[old.length - 1];
    }

    @Override
    public String toString() {
        String r = "Stack: ";
        for (Integer i : stack) {
            r += i + " ";
        }
        if (stack.length == 0) {
            r += "(Empty)";
        } else {
            r += "<-- Top";
        }
        return r;
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        System.out.println(stack);
        stack.push(123);
        stack.push(21);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }

}
