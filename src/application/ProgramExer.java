package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class ProgramExer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos estudantes vão alugar? ");
		int n = sc.nextInt();
		
		
		Estudantes vect[] = new Estudantes[10];
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Estudantes(nome, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i] != null) {
				
				System.out.println(vect[i].getRoom()+ ": " + vect[i].getNome() +  ", "+ vect[i].getEmail());
			}
		}
		
		sc.close();
	}

}
