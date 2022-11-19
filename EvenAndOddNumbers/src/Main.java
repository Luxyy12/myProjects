public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {
                1, 5, 10, 13, 25, 50, 100, 125, 133, 152, 200
        };
        String oddNumbers = "";
        String evenNumbers = "";

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0)
                evenNumbers += String.valueOf(numbers[i]) + " ";
            else
                oddNumbers += String.valueOf(numbers[i]) + " ";
        }

        System.out.println("even numbers: " + evenNumbers);
        System.out.println("odd numbers: " + oddNumbers);
    }
}