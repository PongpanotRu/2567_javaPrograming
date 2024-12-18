import java.util.*;

public class Lab303 
{

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "";
        String word = "";

        while (true) {
            System.out.print("Input a sentence: ");
            word = input.nextLine();

            if (word.equalsIgnoreCase(".")) {
                System.out.println("Input a sentence: " + word);
                break;
            } else {
                System.out.println("Input a sentence, again: " + word);
                sentence += word + " ";
            }
        }
        int spaceCount = sentence.length() - sentence.replace(" ", "").length();
        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("This sentence has " + spaceCount + " spacebar");
        System.out.println("This sentence has " + wordCount + " word");
        input.close();
    }
}