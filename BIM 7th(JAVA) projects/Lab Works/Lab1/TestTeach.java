
package Lab1;


import java.util.*;

public class TestTeach {

    int teacherid;
    String fullname;
    String Email;
    Double Salary;

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    public static void main(String[] args) {
        TestTeach ob = new TestTeach();
        ob.setFullname("nikhil khanal");
        System.out.println(ob.getFullname());

        ob.setTeacherid(1);
        System.out.println(ob.getTeacherid());

        ob.setEmail("nikhil.khanal.nepal7@gmail.com");
        System.out.println(ob.getEmail());

        ob.setSalary(10000.0);
        System.out.println(ob.getSalary());

    }
}
