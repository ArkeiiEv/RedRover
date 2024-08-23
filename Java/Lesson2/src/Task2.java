import java.util.Scanner;
public class Task2 {
    static Scanner scanner = new Scanner(System.in);
    public static double enterValue(String value){
        System.out.println("Enter value of " + value);
        double summary = scanner.nextDouble();
        return summary;
    }

    public static void lootDivider(){
        double amountOfLoot = enterValue("loot");
        double quantityofPirates = enterValue("people");

        scanner.nextLine();

        System.out.println("Enter owners name");
        String nameOfOwner = scanner.nextLine();

        System.out.println("Enter captain's name");
        String nameOfCaptain = scanner.nextLine();

        double captainsLoot;
        double teamLoot;
        double ownerLoot = (amountOfLoot) / 2;

        if(nameOfCaptain.equals(nameOfOwner)){
            captainsLoot = ownerLoot + (ownerLoot / ++quantityofPirates);
            teamLoot = (amountOfLoot - captainsLoot);
            System.out.println("I'm Jack Sparrow & I'm owner of this ship my loot = " + captainsLoot);
            System.out.println("Team's loot = " + teamLoot);
        }
        else {
            captainsLoot = (amountOfLoot / 4) + ((amountOfLoot / 4) / ++quantityofPirates);
            teamLoot = amountOfLoot - (ownerLoot + captainsLoot);
            System.out.println("Owner's loot = " + ownerLoot);
            System.out.println("Captain's loot = " + captainsLoot);
            System.out.println("Team's loot = " + teamLoot);
        }
    }

    public static void main(String[] args) {
        lootDivider();
    }
}
