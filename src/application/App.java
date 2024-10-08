package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Estudante;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Double[] notas;
		Estudante estudante = new Estudante();
		int opc = 1;
		while(opc != 0) {
			System.out.println("1 - Criar aluno");
			System.out.println("2 - Remover aluno");
			System.out.println("3 - Listar alunos");
			System.out.println("4 - Listar alunos aprovados e reprovados");
			System.out.println("0 - Sair");
			System.out.print("Digite uma opção: ");
			opc = sc.nextInt();
			sc.nextLine();
			
			switch(opc) {
				case 1:
					System.out.print("Digite o nome do aluno: ");
					String nameAluno = sc.nextLine();
					notas = new Double[3];
					for(int i = 0; i < 3; i++) {
						System.out.print("Digite a nota #" + (1+i) + ": ");
						notas[i] = sc.nextDouble();						
					}
					estudante.criarAluno(nameAluno, notas);
					break;
					
				case 2:
					System.out.print("Digite o aluno a ser removido: ");
					String nameRemove = sc.nextLine();
					estudante.removerAluno(nameRemove);
					break;
					
				case 3:
					System.out.println();
					estudante.listarAlunos();
					System.out.println();
					break;
					
				case 4:
					estudante.listarAprovado();
					System.out.println();
					break;
					
				case 0:
					System.out.println("CADASTROS ENCERRADOS");
					break;
					
				default:
					System.out.println("Código invalido");
					break;
			}
		}

	}

}
