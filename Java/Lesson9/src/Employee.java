public class Employee extends Person{
    private double salary;
    public Employee(String name, int age, char gender, double salary){
        super(name, age, gender);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return this.getName().equals(employee.getName());
    }

    protected double getSalary() {
        return salary;
    }
}
