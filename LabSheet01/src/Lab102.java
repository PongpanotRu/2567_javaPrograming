import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of minutes: ");
        double min = input.nextDouble();
        int year = 60 * 24 * 365;
        int day = 60 * 24;

        int years = (int) (min / year); 
        int remain = (int) (min % year); 
        int days = remain / day;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");

        input.close();
    }
}