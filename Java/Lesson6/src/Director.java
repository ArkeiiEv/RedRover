public class Director extends Manager {
    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return Math.round(getBaseSalary() + (1 + getNumberOfSubordinates() / 0.09));
        }
        else{
            return getBaseSalary();
        }
    }
}

