public class TestStackOfIntegers {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i <= 9; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();

        StackOfIntegers stack2 = new StackOfIntegers(5);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.println("Size: " + stack2.getSize());
        System.out.println("Peek: " + stack2.peek());
        System.out.println("Pop: " + stack2.pop());
        System.out.println("Size after pop: " + stack2.getSize());
    }
}
