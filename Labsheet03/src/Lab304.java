import java.util.*;

public class Lab304 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name (FirstName LastName): ");
        String fullName = input.nextLine();
        String firstName, lastName;
        int spaceIndex = fullName.indexOf(" ");
        if (spaceIndex != -1) {
            firstName = fullName.substring(0, spaceIndex);
            lastName = fullName.substring(spaceIndex + 1);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Incorrect Name");
        }
        input.close();
    }
}