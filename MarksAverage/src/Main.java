import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks(format: 1, 2, 5, 3, 2): ");
        String marks = scanner.nextLine();
        String[] values = marks.split(", ");
        int[] intValues = new int[values.length];
        int allValues = 0;

        for(int i = 0; i < intValues.length; i++){
            intValues[i] = Integer.parseInt(values[i]);
            allValues += intValues[i];
        }

        float average = allValues / (float)intValues.length;
        System.out.printf("Average mark: %.2f", average);
    }
}