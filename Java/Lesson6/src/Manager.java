public class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
       if (numberOfSubordinates == 0) {
           return getBaseSalary();
       }
       else{
           return Math.round(getBaseSalary() * (1 + numberOfSubordinates * 0.03));
       }
    }
}
