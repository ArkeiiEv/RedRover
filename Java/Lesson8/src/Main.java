import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.numToStringConverter(58391));

        Employee[] employees = {
                new Employee("Иван", 12000, 2),
                new Employee("Ольга", 8000, 1),
                new Employee("Андрей", 4500, 3)
        };

        TaxPayment[] taxPayments = Utils.calculateTaxPayment(employees);

        for (TaxPayment taxPayment : taxPayments) {
            System.out.println(taxPayment);
        }

        List<String> students = Arrays.asList("Иванов", "Петров", "Сидоров", "Смирнов", "Кузнецов");

        GradeBook gradebook = new GradeBook(students);

        gradebook.setGrade("Иванов", 1, 5);
        gradebook.setGrade("Петров", 1, 4);
        gradebook.setGrade("Сидоров", 1, 3);
        gradebook.setGrade("Смирнов", 1, 2);
        gradebook.setGrade("Кузнецов", 1, 5);

        gradebook.printGradesForClass(1);

        gradebook.setGrade("Иванов", 2, 3);
        gradebook.setGrade("Петров", 2, 5);
        gradebook.setGrade("Сидоров", 2, 4);

        gradebook.printAllGrades();

        System.out.println("Средний балл Иванова: " + gradebook.calculateAverageGrade("Иванов"));
    }
}