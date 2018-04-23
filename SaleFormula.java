package saleCalculator;

public class SaleFormula {
	
	
	double price=0.0;
	double salePercent=0.0;
	double taxPercent=0.0;
	
	
	
	/**
	 * @param price
	 * @param salePercent
	 * @param taxPercent
	 */
	public SaleFormula(double price, double salePercent, double taxPercent) {
		super();
		this.price = price;
		this.salePercent = salePercent;
		this.taxPercent = taxPercent;
	}



	public double formula () {
		double total=price-(price*salePercent)+(price*taxPercent);
		return total;
	}
	

}
