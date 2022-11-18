import java.util.Scanner;

public class Main {
//    Program calculated price of fuel on X km, it must know consumption on 100km and price.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float price = 0;
        float consumption = 0;
        float kilometers = 0;

        System.out.println("Fuel price calculator");
        System.out.print("Enter price of fuel for 1L: ");
        price = Float.parseFloat(sc.nextLine());
        System.out.print("Enter comsumption for 100km: ");
        consumption = Float.parseFloat(sc.nextLine());
        System.out.print("Enter the number of kilometres for which you want to calculate the price: ");
        kilometers = Float.parseFloat(sc.nextLine());

        price = consumption * price / 100 * kilometers;
        System.out.println("\nPrice for " + kilometers + " is " + price + "€");
    }
}