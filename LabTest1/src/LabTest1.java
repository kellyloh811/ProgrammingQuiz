import java.util.*;
public class LabTest1 {

	public static void main(String[] args) {
		System.out.println("1.");
		Scanner in = new Scanner (System.in);
		
		int items; 
		
		System.out.print("Enter the number of items:");
		items = in.nextInt();
		System.out.print("Enter price of first item:");
		double price1 = in.nextDouble();
		System.out.print("Enter quantity of first item:");
		int quantity1 = in.nextInt();
		System.out.println();

		if (items<=3) {
			System.out.print("Enter price of second item:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second item:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of third item:");
			double price3 = in.nextDouble();
			System.out.print("Enter quantity of third item:");
			int quantity3 = in.nextInt();
			System.out.println();
			
			double totalprice = ((price1*quantity1) + (price2*quantity2) + (price3*quantity3));
			System.out.printf("Total price 		:RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>100) {
				double discount = totalprice/100*20;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				double discount = totalprice/100*10;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
				
			}
			
			System.out.println();
		}
		
		
		System.out.println("2.");
		
		System.out.print("Enter sales		:RM");
		int sales = in.nextInt();
		System.out.print("Enter hours worked	:");
		int hours = in.nextInt();
		
		
		if (sales>=150 && sales<=300) {
			double commission = sales/100*5;
			System.out.printf("Commission	: RM%.2f" , commission);
			System.out.println();
			double wages = commission+(hours*5);
			System.out.printf("Daily wages	: RM%.2f" , wages);
		} 
		else if (sales>=301 && sales<=500) {
			double commission = sales/100*10;
			System.out.printf("Commission	: RM%.2f" , commission);
			System.out.println();
			double wages = commission+(hours*5);
			System.out.printf("Daily wages	: RM%.2f" , wages);
		}
		else if (sales>500) {
			double commission = sales/100*15;
			System.out.printf("Commission	: RM%.2f" , commission);
			System.out.println();
			double wages = commission+(hours*5);
			System.out.printf("Daily wages	: RM%.2f" , wages);
		}
		
	}

}
