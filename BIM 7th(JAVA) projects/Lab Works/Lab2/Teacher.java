
package Lab2;


public class Teacher {

    private String fullName;
    private String email;
    private double salary;

    // Parameterized constructor
    public Teacher(String fullName, String email, double salary) {
        this.fullName = fullName;  
        this.email = email;
        this.salary = salary;
    }

    // Default constructor
    public Teacher() {
     
    }

    // Getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method accepting an object of the same class
    public void printTeacherInfo(Teacher teacher) {
        System.out.println("Full Name: " + teacher.getFullName());
        System.out.println("Email: " + teacher.getEmail());
        System.out.println("Salary: " + teacher.getSalary());
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Teacher teacher1 = new Teacher("Nikhil khanal", "nikhil@gmail.com", 500.0);

        // Creating an object using the default constructor and setting properties using setters
        Teacher teacher2 = new Teacher();
        teacher2.setFullName("Nikhil khanal");
        teacher2.setEmail("nikhil@gmail.com");
        teacher2.setSalary(550.0);

        teacher1.printTeacherInfo(teacher1);
        teacher2.printTeacherInfo(teacher2);
    }
}
