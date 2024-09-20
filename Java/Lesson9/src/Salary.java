public class Salary extends Employee {
    public Salary(String name, int age, char gender, double salary) {
        super(name, age, gender, salary);
    }

    public static double getSummary(Employee[] employees){
        double sum = 0;
        for(Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }
}
