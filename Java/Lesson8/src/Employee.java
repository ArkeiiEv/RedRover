package Java.Lesson8.src;

public class Employee {
    private String name;
    private int salary;
    private int numOfChildren;

    public Employee(String name, int salary, int numOfChildren) {
        this.name = name;
        this.salary = salary;
        this.numOfChildren = numOfChildren;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }
}
