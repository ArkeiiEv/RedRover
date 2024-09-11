public class Utils{
    public static Employee findByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public static Employee findByPartialName(Employee[] employees, String substring) {
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                return employee;
            }
        }
        return null;
    }

    public static double calculateTotalSalaryBudget(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static Manager findManagerWithMinSubordinates(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager minSubordinatesManager = managers[0];
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < minSubordinatesManager.getNumberOfSubordinates()) {
                minSubordinatesManager = manager;
            }
        }
        return minSubordinatesManager;
    }

    public static Manager findManagerWithMaxSubordinates(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager maxSubordinatesManager = managers[0];
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > maxSubordinatesManager.getNumberOfSubordinates()) {
                maxSubordinatesManager = manager;
            }
        }
        return maxSubordinatesManager;
    }

    public static Manager findManagerWithMaxBonus(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager maxBonusManager = managers[0];
        double maxBonus = maxBonusManager.getSalary() - maxBonusManager.getBaseSalary();
        for (Manager manager : managers) {
            double bonus = manager.getSalary() - manager.getBaseSalary();
            if (bonus > maxBonus) {
                maxBonus = bonus;
                maxBonusManager = manager;
            }
        }
        return maxBonusManager;
    }

    // Поиск менеджера с наименьшей надбавкой
    public static Manager findManagerWithMinBonus(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager minBonusManager = managers[0];
        double minBonus = minBonusManager.getSalary() - minBonusManager.getBaseSalary();
        for (Manager manager : managers) {
            double bonus = manager.getSalary() - manager.getBaseSalary();
            if (bonus < minBonus) {
                minBonus = bonus;
                minBonusManager = manager;
            }
        }
        return minBonusManager;
    }

}