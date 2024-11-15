import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee{
    int id;
    String name;
    String address;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
public static int compareBySal(Employee e1,Employee e2) {
        if(e1.getSalary()>e2.getSalary()){
            return 1;
        }
        else if(e1.getSalary()< e2.getSalary()){
            return -1;
        }else {
            return 0;
        }
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
