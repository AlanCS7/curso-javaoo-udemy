package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramBank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter accont number: ");
		int numConta = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();

		String name = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);

		Account accountBank = new Account();

		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			accountBank = new Account(name, numConta, deposito);

		} else if (resposta == 'n') {
			accountBank = new Account(name, numConta);

		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(accountBank);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositoValor = sc.nextDouble();
		accountBank.deposito(depositoValor);

		System.out.println("Updated account data:");
		System.out.println(accountBank);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		accountBank.saque(saque);

		System.out.println("Updated account data:");
		System.out.println(accountBank);
		
		sc.close();
	}

}