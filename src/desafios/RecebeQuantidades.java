package desafios;

import java.util.Scanner;

public class RecebeQuantidades {
	
	int alunos = 0;
	int notas = 0;
	
	RecebeQuantidades(int alunos, int notas){
		this.alunos = alunos;
		this.notas = notas;
	}
	
	RecebeQuantidades(){
		
	}
	
	static void recebeDados(RecebeQuantidades recebe) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a Quantidade de Alunos:");
		recebe.alunos = scanner.nextInt();

		System.out.println("Informe a Quantidade de notas:");
		recebe.notas = scanner.nextInt();
		scanner.close();
	}

}
