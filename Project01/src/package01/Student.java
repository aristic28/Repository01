package package01;

public class Student {
    private final String firstName;
    private final String lastName;
    private final double avarage;

    public Student(String firstName,String lastName,double avarage){
        this.firstName=firstName;
        this.lastName=lastName;
        this.avarage=avarage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avarage=" + avarage +
                '}';
    }
}
