import javax.swing.*;

public class Lab104 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Welcome to the payroll application");
        String name = JOptionPane.showInputDialog("Enter employee name");
        String hour = JOptionPane.showInputDialog("Enter total hours for this employee");
        double hourwork = Double.parseDouble(hour);
        
        String hourlyWageInput = JOptionPane.showInputDialog("Enter hourly wage for this employee");
        double hourly = Double.parseDouble(hourlyWageInput);
        double gross = hoursWorked * hourlyWage;
        
        double tax = gross * 0.15;
        double net = gross - tax;
        
        String output = String.format(
            "Employee name: %s\nHours worked: %.2f\nHourly wage:$ %.2f\nGross earnings:$ %.2f\nTax rate: 15%%\nTax:$ %.2f\nNet earnings:$ %.2f",
            name, hour, hourly, gross, tax, net
        );

        JOptionPane.showMessageDialog(null, output);
    }
}