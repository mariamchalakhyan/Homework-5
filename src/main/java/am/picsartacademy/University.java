package am.picsartacademy;

public class University {
    private String name;
    private String location;
    private Student student;
    private Professor professor;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void printDetails() {
        System.out.println("University: " + name + " (" + location + ")");
         {
            System.out.println("Student: " + student.firstName + " " + student.lastName);
        }
        {
            System.out.println("Professor: " + professor.firstName + " " + professor.lastName);
        }
    }
}