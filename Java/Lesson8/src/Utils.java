public class Utils {
    public static String numToStringConverter(int num){
        String[] digitNames = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        StringBuilder result = new StringBuilder();
        while (num > 0){
            int digit = num % 10;
            result.insert(0, digitNames[digit] + " ");
            num /= 10;
        }
        return result.toString().trim();
    }

    public static TaxPayment[] calculateTaxPayment(Employee[] employees){
        TaxPayment[] taxPayments = new TaxPayment[employees.length];
        for (int i = 0; i < employees.length; i++){
            Employee employee = employees[i];
            double taxIncome = employee.getSalary() - employee.getNumOfChildren() * 1000;

            if (taxIncome < 0){
                taxIncome = 0;
            }
            double taxRate;
            if(taxIncome > 10000){
                taxRate = 0.23;
            }
            else if(taxIncome >= 5000){
                taxRate = 0.18;
            }
            else{
                taxRate = 0.10;
            }

            double taxAmount = taxIncome * taxRate;
            taxPayments[i] = new TaxPayment(employee.getName(), taxAmount);
        }
        return taxPayments;
    }
}
