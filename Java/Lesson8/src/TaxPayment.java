public class TaxPayment  {
    private String employeeName;
    private double taxAmount;

    public TaxPayment(String employeeName, double taxAmount) {
        this.employeeName = employeeName;
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString() {
        return "Employee Name: " + employeeName + ", Tax Amount: $" + taxAmount;
    }
}

