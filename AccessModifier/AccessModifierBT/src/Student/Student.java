package Student;

public class Student {
    private String name = "John";
    private String claxx = "C02";

    public Student() {

    }
    public Student(String name , String claxx){
        this.name = name;
        this.claxx = claxx;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClaxx(String claxx) {
        this.claxx = claxx;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", claxx='" + claxx + '\'' +
                '}';
    }
}
