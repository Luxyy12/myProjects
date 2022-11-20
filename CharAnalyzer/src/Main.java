import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text/sentence: ");
        String text = scanner.nextLine();

        String vowels = "aeiyou";
        String consonants = "bcdfghjklmnboqrstvwxz";

        int vowelsNumber = 0;
        int consonantsNumber = 0;
        int otherCharacters = 0;

        for(int i = 0; i < text.length(); i++){
            String character = String.valueOf(text.charAt(i)).toLowerCase();
            if(vowels.contains(character)){
                vowelsNumber++;
            }
            else {
                if(consonants.contains(character)){
                    consonantsNumber++;
                }
                else
                    otherCharacters++;
            }
        }

        System.out.println("vowels: " + vowelsNumber);
        System.out.println("consonants: " + consonantsNumber);
        System.out.println("other characters: " + otherCharacters);
    }
}