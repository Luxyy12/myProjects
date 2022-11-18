import java.util.Scanner;

public class Main {
//    Program writes to console stars("*"). It ask how many columns and rows user wants and run in the cycle until user don´t end program.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfColumns = 0;
        int numberOfRows = 0;
        String option = "1";

        while(option.equals("1")) {
            System.out.println("1. Write stars");
            System.out.println("2. End");
            System.out.print("Choose option: ");
            option = sc.nextLine();
            if(option.equals("1")) {
                System.out.print("Enter the number of columns: ");
                numberOfColumns = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the number of rows: ");
                numberOfRows = Integer.parseInt(sc.nextLine());

                for (int i = 0; i < numberOfRows; i++) {
                    for (int j = 0; j < numberOfColumns; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            else
                System.out.println("You ended program!");
        }
    }
}