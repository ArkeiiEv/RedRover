public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", 23, 'm');
        System.out.println(person.getName());

        Employee employee = new Employee("Alex", 23, 'm', 5000);
        Employee employee2 = new Employee("Alex", 23, 'm', 3000);
        Employee employee3 = new Employee("Bobr", 23, 'm', 200);

        if (employee.isSameName(employee2)) {
            System.out.println("Имена employee1 и employee2 совпадают.");
        } else {
            System.out.println("Имена employee1 и employee2 не совпадают.");
        }

        if (employee.isSameName(employee3)) {
            System.out.println("Имена employee1 и employee3 совпадают.");
        } else {
            System.out.println("Имена employee1 и employee3 не совпадают.");
        }

        Employee[] employees = {employee, employee2, employee3};
        double totalSalary = Salary.getSummary(employees);
        System.out.println(totalSalary);

    }
}