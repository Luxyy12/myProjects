import java.util.Scanner;

public class Main {
//    Program writes pyramid from stars
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRows = 0;
        int numberOfStars = 1;

        System.out.print("Enter number of rows: ");
        numberOfRows = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= numberOfRows; i++) {
            for (int j = numberOfRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int stars = numberOfStars; stars > 0; stars--){
                System.out.print("*");
            }
            for(int j = numberOfRows - 1; j > 0; j--){
                System.out.print(" ");
            }
            numberOfStars = numberOfStars + 2;
            System.out.println("\n");
        }
    }
}