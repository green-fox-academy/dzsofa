
public class Student implements Cloneable {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numbeOfDays) {
        skippedDays += numbeOfDays;
    }

    public Student clone() {
        Student clone = new Student(this.name, this.age, this.gender, this.previousOrganization);
        return clone;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.gender + ", " + this.previousOrganization;
    }

    public static void main(String[] args) {

        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();

        System.out.println(john.toString());
        System.out.println(johnTheClone.toString());

    }
}