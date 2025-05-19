package am.picsartacademy;

public class Student extends Person {

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void study() {
        System.out.println(firstName + " " + lastName + " is studying.");
    }
}

