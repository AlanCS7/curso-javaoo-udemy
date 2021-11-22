package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantityDollar = sc.nextDouble();
		
		double valorDollar = CurrencyConverter.valorDollar(quantityDollar, priceDollar);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", valorDollar));
		
		sc.close();
		
	}

}