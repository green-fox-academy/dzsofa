public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String company) {
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        company = "Google";
        hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

}
