package am.picsartacademy;

public class Main {
    public static void main(String[] args) {
        University seua = new University("SEUA", "Yerevan");

        Student student1 = new Student("Sona", "Galoyan");
        Professor prof1 = new Professor("Alex", "Sargsyan");

        seua.setStudent(student1);
        seua.setProfessor(prof1);

        seua.printDetails();

        seua.getStudent().study();
        seua.getProfessor().teach();
    }
}