public class Mentor extends Person {
    String level;

    public Mentor(String name, int age, String gender, String level) {
        super.name = name;
        super.age = age;
        super.gender = gender;
        this.level = level;
    }

    public Mentor() {
        level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }
}
