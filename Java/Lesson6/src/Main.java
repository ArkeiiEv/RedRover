public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Алиса", 3000);
        Worker worker2 = new Worker("Бобитто", 3500);

        Manager manager1 = new Manager("Карол", 4000, 5);
        Manager manager2 = new Manager("Дэйв", 4500, 10);

        Director director1 = new Director("Ева", 6000, 15);
        Director director2 = new Director("Фрэнк", 6500, 0);

        Employee[] employees = {worker1, worker2, manager1, manager2, director1, director2};
        Manager[] managers = {manager1, manager2};

        Employee foundEmployee = Utils.findByName(employees, "Алиса");
        System.out.println("Найден сотрудник: " + foundEmployee.getName());

        foundEmployee = Utils.findByPartialName(employees, "Бо");
        System.out.println("Найден сотрудник с частичным совпадением: " + foundEmployee.getName());

        double totalSalaryBudget = Utils.calculateTotalSalaryBudget(employees);
        System.out.println("Общий зарплатный бюджет: " + totalSalaryBudget);

        Employee minSalaryEmployee = Utils.findEmployeeWithMinSalary(employees);
        System.out.println("Сотрудник с наименьшей зарплатой: " + minSalaryEmployee.getName() + " (" + minSalaryEmployee.getSalary() + ")");

        Employee maxSalaryEmployee = Utils.findEmployeeWithMaxSalary(employees);
        System.out.println("Сотрудник с наибольшей зарплатой: " + maxSalaryEmployee.getName() + " (" + maxSalaryEmployee.getSalary() + ")");

        Manager minSubordinatesManager = Utils.findManagerWithMinSubordinates(managers);
        System.out.println("Менеджер с наименьшим количеством подчиненных: " + minSubordinatesManager.getName() + " (" + minSubordinatesManager.getNumberOfSubordinates() + ")");

        Manager maxSubordinatesManager = Utils.findManagerWithMaxSubordinates(managers);
        System.out.println("Менеджер с наибольшим количеством подчиненных: " + maxSubordinatesManager.getName() + " (" + maxSubordinatesManager.getNumberOfSubordinates() + ")");

        Manager maxBonusManager = Utils.findManagerWithMaxBonus(managers);
        System.out.println("Менеджер с наибольшей надбавкой: " + maxBonusManager.getName() + " (Надбавка: " + (maxBonusManager.getSalary() - maxBonusManager.getBaseSalary()) + ")");

        Manager minBonusManager = Utils.findManagerWithMinBonus(managers);
        System.out.println("Менеджер с наименьшей надбавкой: " + minBonusManager.getName() + " (Надбавка: " + (minBonusManager.getSalary() - minBonusManager.getBaseSalary()) + ")");

        System.out.println("Директор 1: " + director1.getName() + " (Зарплата: " + director1.getSalary() + ")");
        System.out.println("Директор 2: " + director2.getName() + " (Зарплата: " + director2.getSalary() + ")");
    }
}