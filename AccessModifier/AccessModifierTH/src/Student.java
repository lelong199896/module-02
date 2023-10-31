public class Student {
    public int rollno;
    public String name;
    private static String college = "BBDIT";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void dipsplay() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"Hoang");
        Student s2 = new Student(222,"Khanh");
        Student s3 = new Student(333,"Nam");

        s1.dipsplay();
        s2.dipsplay();
        s3.dipsplay();
    }
}
