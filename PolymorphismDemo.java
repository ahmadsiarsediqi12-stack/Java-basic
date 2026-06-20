public class PolymorphismDemo {

    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new StudentPoly());
        m(new PersonPoly());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends StudentPoly {
}

class StudentPoly extends PersonPoly {
    public String toString() {
        return "Student";
    }
}

class PersonPoly extends Object {
    public String toString() {
        return "Person";
    }
}
