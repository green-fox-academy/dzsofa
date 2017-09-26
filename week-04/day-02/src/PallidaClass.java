import java.util.ArrayList;

public class PallidaClass {
    String classname;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public PallidaClass(String classname) {
        this.classname = classname;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student st) {
        students.add(st);
    }

    public void addMentor(Mentor m) {
        mentors.add(m);
    }

    public void info() {
        System.out.println("Pallida " + classname + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
