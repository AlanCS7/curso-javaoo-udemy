package util;

public class CurrencyConverter {


	public static final double IOF = 0.06;

	public static double valorDollar(double quantityDollar, double priceDollar) {
		double valorFinal = quantityDollar * priceDollar;
		double valorIOF = valorFinal * IOF;
		
		return valorFinal + valorIOF;
	}
	
}
