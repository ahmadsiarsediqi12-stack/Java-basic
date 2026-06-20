public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public void dropStudent(String student) {
        int indexToRemove = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }

    public void clear() {
        students = new String[100];
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        System.arraycopy(students, 0, result, 0, numberOfStudents);
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        course.addStudent("Peter Jones");
        course.addStudent("Brian Smith");
        course.addStudent("Anne Kennedy");

        String[] students = course.getStudents();
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Number of students: " + course.getNumberOfStudents());

        course.dropStudent("Brian Smith");
        System.out.println("After dropping Brian Smith:");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        course.clear();
        System.out.println("After clear, number of students: " + course.getNumberOfStudents());
    }
}
