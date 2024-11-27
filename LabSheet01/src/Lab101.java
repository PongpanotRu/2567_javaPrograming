import java.util.*;
import java.text.*;
public class  Lab101 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		System.out.print("Input Product name: ");
		String productName = input.nextLine();
		System.out.print("Input Product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit: ");
		float productPrice = input.nextFloat();
		
		System.out.println("-----------------------------");
		
		float totalPriceofProduct = productUnit *productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct)+" bath.");
		
		System.out.println("-----------------------------");
		
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		
		System.out.println("-----------------------------");
		
		float discountam = totalPriceofProduct *discount/100;
		float totalwithVat = productPrice-discountam;
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		float total = totalPriceofProduct-discountam;
		
		System.out.println("Discount from "+discount+"%   "+frm.format(discountam)+" bath.");
		System.out.println("Amount to be paid   "+frm.format(total)+" bath.");

		
		input.close();

	}

}
