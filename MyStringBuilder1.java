public class MyStringBuilder1 {
    private char[] chars;
    private int size;

    public MyStringBuilder1(String s) {
        chars = new char[s.length() + 16];
        size = s.length();
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        ensureCapacity(size + s.length());
        for (int i = 0; i < s.length(); i++) {
            chars[size + i] = s.charAt(i);
        }
        size += s.length();
        return this;
    }

    public MyStringBuilder1 append(int i) {
        String s = String.valueOf(i);
        ensureCapacity(size + s.length());
        for (int j = 0; j < s.length(); j++) {
            chars[size + j] = s.charAt(j);
        }
        size += s.length();
        return this;
    }

    public int length() {
        return size;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < size; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i < end; i++) {
            sb.append(chars[i]);
        }
        return new MyStringBuilder1(sb.toString());
    }

    public String toString() {
        return new String(chars, 0, size);
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > chars.length) {
            char[] newChars = new char[Math.max(minCapacity, chars.length * 2)];
            System.arraycopy(chars, 0, newChars, 0, size);
            chars = newChars;
        }
    }

    public static void main(String[] args) {
        MyStringBuilder1 sb1 = new MyStringBuilder1("Hello");
        sb1.append(123);
        System.out.println(sb1);

        MyStringBuilder1 sb2 = new MyStringBuilder1(" World");
        sb1.append(sb2);
        System.out.println(sb1);

        System.out.println("length: " + sb1.length());
        System.out.println("charAt(0): " + sb1.charAt(0));
        System.out.println("substring(0, 5): " + sb1.substring(0, 5));
        System.out.println("toLowerCase: " + sb1.toLowerCase());
    }
}
