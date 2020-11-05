import java.util.*;
public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Input your height in feets (female) :");
		double hff = in.nextDouble();
		System.out.print("Input your height in inches (female) :");
		double hif = in.nextDouble();
		System.out.print("Input your height in feets (male) :");
		double hfm = in.nextDouble();
		System.out.print("Input your height in inches (male) :");
		double him = in.nextDouble();
		
		double idealf = ((((hff-5)*12)+hif)*5)+40;
		double idealm = ((((hfm-5)*12)+him)*6)+50;
		System.out.println("Your ideal weight in kg (female) :" + idealf);
		System.out.println("Your ideal weight in kg (male) :" + idealm);
	}

}
