import java.util.*;

public class Lab305 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input some sentence: ");
        String sentence = input.nextLine();
        if (sentence.endsWith(".")) {
            System.out.println("The sentence must end with full stop point: " + sentence);
            sentence = sentence.substring(0, sentence.length() - 1); 
            String[] words = sentence.split(" "); 
            for (String word : words) {
                System.out.println(word);
            }
        } else {
            System.out.println("The sentence must end with full stop point.");
        }
        input.close();
    }
}