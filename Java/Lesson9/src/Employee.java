package Java.Lesson9.src;

public class Employee extends Person{
    private double salary;
    public Employee(String name, int age, char gender, double salary){
        super(name, age, gender);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return this.getName().equals(employee.getName());
    }

    public double getSalary() {
        return salary;
    }
}
