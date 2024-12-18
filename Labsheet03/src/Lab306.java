import java.util.*;

public class Lab306 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a message: ");
        String message = input.nextLine();
        if (message.toLowerCase().contains("nichi")) {
            System.out.println("Message: " + message);
            System.out.println("Nichi is a sentence");
        } else {
            System.out.println("Message: " + message);
            System.out.println("Nichi is not found");
        }
        input.close();
    }
}