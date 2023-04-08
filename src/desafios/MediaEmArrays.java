package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class MediaEmArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int escolha;
		int alunos = 0;
		int notas = 0;
		double total = 0;
		double media = 0;

		do {
			alunos = alunos;
			notas = notas;
			double[][] notasDaTurma = new double[alunos][notas];
			menuInicial();
			escolha = scanner.nextInt();
			switch (escolha) {
			case 1:
				// operação para receber a quantidade de alunos e de notas
				System.out.println("Informe a Quantidade de Alunos:");
				alunos = scanner.nextInt();

				System.out.println("Informe a Quantidade de notas:");
				notas = scanner.nextInt();

				break;
			case 2:
				// operação para receber as notas
				for (int a = 0; a < notasDaTurma.length; a++) {
					for (int n = 0; n < notasDaTurma[a].length; n++) {

						System.out.printf("Informe a nota %d do aluno %d:", (n + 1), (a + 1));
						notasDaTurma[a][n] = scanner.nextDouble();
				
					}
				}
				
				break;
			case 3:
				break;
			case 4:
				// operação para mostrar as notas da turma
				//for(double[]nota: notasDaTurma) {
				//	System.out.println(Arrays.toString(notasDaTurma));
					
				//}
				break;
			case 5:
				// sair do programa
				System.out.println("Ate logo!!!");
				break;
			}

		} while (escolha != 5);

		scanner.close();
	}

	static void menuInicial() {
		System.out.println("\nInforme a operação: ");
		System.out.println("1 - Informar a Quantitade de Alunos e Notas ");
		System.out.println("2 - Informar as Notas");
		System.out.println("3 - Mostrar a media do Aluno ");
		System.out.println("4 - Mostrar as notas da Turma ");
		System.out.println("5 - Sair ");
	}
	
	

}
