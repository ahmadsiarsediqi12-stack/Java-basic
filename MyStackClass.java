import java.util.ArrayList;

public class MyStackClass {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        return list.remove(getSize() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    public int search(Object o) {
        for (int i = getSize() - 1; i >= 0; i--) {
            if (list.get(i).equals(o))
                return getSize() - i;
        }
        return -1;
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        MyStackClass stack = new MyStackClass();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("Go");

        System.out.println("Stack: " + stack);
        System.out.println("Size: " + stack.getSize());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Search Java: " + stack.search("Java"));
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("isEmpty: " + stack.isEmpty());
    }
}
