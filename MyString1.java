public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] result = new char[end - begin];
        for (int i = begin; i < end; i++) {
            result[i - begin] = chars[i];
        }
        return new MyString1(result);
    }

    public MyString1 toLowerCase() {
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(result);
    }

    public boolean equals(MyString1 s) {
        if (this.length() != s.length())
            return false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i))
                return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(String.valueOf(i).toCharArray());
    }

    public String toString() {
        return new String(chars);
    }

    public static void main(String[] args) {
        MyString1 s1 = new MyString1("Hello".toCharArray());
        MyString1 s2 = new MyString1("Hello".toCharArray());
        MyString1 s3 = new MyString1("World".toCharArray());

        System.out.println("s1: " + s1);
        System.out.println("charAt(1): " + s1.charAt(1));
        System.out.println("length: " + s1.length());
        System.out.println("substring(1, 3): " + s1.substring(1, 3));
        System.out.println("toLowerCase: " + s1.toLowerCase());
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("valueOf(123): " + MyString1.valueOf(123));
    }
}
