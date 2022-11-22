import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        String charactersForReplace = "";

        System.out.print("Enter some text: ");
        text = sc.nextLine();
        System.out.print("Enter character or characters: ");
        charactersForReplace = sc.nextLine();

        StringBuilder originalText = new StringBuilder(text);
        StringBuilder editedText = new StringBuilder("");

        int i = 0;
        while (i < originalText.toString().length()) {
            if(i % 2 != 0) {
                editedText.append(charactersForReplace);
            }
            else{
                editedText.append(originalText.charAt(i));
            }
            i++;
        }

        System.out.println("Edited string: " + editedText.toString());
    }
}



