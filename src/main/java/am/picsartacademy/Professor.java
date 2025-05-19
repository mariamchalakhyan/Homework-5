package am.picsartacademy;

public class Professor extends Person {

    public Professor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void teach() {
        System.out.println(firstName + " " + lastName + " is teaching.");
    }
}