package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		
		if(aluno.notaFinal() < 60) {			
		
		System.out.println("NOTA FINAL = " + aluno.notaFinal());
		System.out.println("FAILED");
		System.out.println("FALTOU " + aluno.notaFaltante() + " PONTOS");
		} else {
			System.out.println("NOTA FINAL = " + aluno.notaFinal());
			System.out.println("PASS");
		}
		
		
		sc.close();
	}

}
