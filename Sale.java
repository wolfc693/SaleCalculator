package saleCalculator;
import java.util.Scanner;
import saleCalculator.SaleFormula;
public class Sale {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the price of the item: ");
		double price=input.nextDouble();
		System.out.println("Enter the discount percent as a decimal: ");
		double discount=input.nextDouble();
		System.out.println("Enter the tax percent as a decimal: ");
		double tax=input.nextDouble();
		
		SaleFormula first = new SaleFormula(price, discount, tax);
		double end=first.formula();
		
		System.out.print(String.format("\n\nThe total cost is $%.2f", end));
		input.close();
	
	}

}
