import java.util.Scanner;

public class Main {
//    Simple calculator with simple operations between 2 numbers (+, -, *, /)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "continue";

        while(!option.equals("5")){
            float numberOne = 0;
            float numberTwo = 0;
            System.out.println("SIMPLE CALCULATOR");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. end program");
            System.out.print("Choose your option: ");
            option = sc.nextLine().toLowerCase();
            if(!option.equals("5")){
                System.out.print("Enter first number: ");
                numberOne = Float.parseFloat(sc.nextLine());
                System.out.print("Enter second number: ");
                numberTwo = Float.parseFloat(sc.nextLine());
                switch (option){
                    case "1":
                        System.out.printf("Result: %.2f + %.2f = %.2f", numberOne, numberTwo, numberOne + numberTwo);
                        break;
                    case "2":
                        System.out.printf("Result: %.2f - %.2f = %.2f", numberOne, numberTwo, numberOne - numberTwo);
                        break;
                    case "3":
                        System.out.printf("Result: %.2f * %.2f = %.2f", numberOne, numberTwo, numberOne * numberTwo);
                        break;
                    case "4":
                        if(numberTwo != 0)
                            System.out.printf("Result: %.2f / %.2f = %.2f", numberOne, numberTwo, numberOne / numberTwo);
                        break;
                }
                System.out.println("\n");
            }
        }
        System.out.println("You have finished the program!");
    }
}