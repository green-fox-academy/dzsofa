class Student {
    public void learn() {
        System.out.println("I learnt sth.");
    }

    public void question(Teacher teacher) {
        System.out.println("Could you please answer my question?");
        teacher.answer();
    }
}

class Teacher {
    public void teach(Student student) {
        System.out.println("And this is how it's done.");
        student.learn();
    }

    public void answer() {
        System.out.println("I answered the question.");
    }
}

public class TeachersAndStudents {
    public static void main(String[] args) {

        Student myStudent = new Student();
        Teacher myTeacher = new Teacher();

        myStudent.question(myTeacher);

        myTeacher.teach(myStudent);
    }
}

