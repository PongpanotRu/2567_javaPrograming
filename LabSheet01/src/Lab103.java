import javax.swing.*;

public class Lab103 {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Input Time Parking (minute):");
        int totalMinutes = Integer.parseInt(input);

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        double cost = (hours * 50) + (minutes * 0.25);
        
        String message = "You parking " + hours + " Hour " + minutes + " Minute.\n";
        JOptionPane.showMessageDialog(null, "Amount to be paid is " + String.format("%.1f", cost) + " bath.");
    }
}