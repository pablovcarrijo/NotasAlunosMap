package model.entities;

import java.util.HashMap;
import java.util.Map;

public class Estudante {

	private Map<String, Double[]> alunos;
	
	private String name;
	
	public Estudante() {
		this.alunos = new HashMap<>();
	}
	
	public void criarAluno(String name, Double notas[]) {
		if(!alunos.containsKey(name)) {
			alunos.put(name, notas);
			System.out.println("Aluno criado com sucesso!\n");
		}
		else {
			System.out.println("Aluno existente\n");
		}
	}
	
	public void removerAluno(String name) {
		if(alunos.containsKey(name)) {
			alunos.remove(name);
			System.out.println("Aluno removido com sucesso!\n");
		}
		else {
			System.out.println("Aluno não cadastrado!\n");
		}
	}

	public void listarAlunos() {
		for(String aluno : alunos.keySet()) {
			System.out.print(aluno + " : ");
			Double[] notasTemp = alunos.get(aluno);
			for(Double nota : notasTemp) {
				System.out.print(" " + String.format("%.2f", nota));
			}
			System.out.println();
		}
	}
	
	public void listarAprovado() {
		for(String aluno : alunos.keySet()) {
			System.out.print(aluno + " : ");
			Double[] notasTemp = alunos.get(aluno);
			int soma = 0;
			for(Double notas : notasTemp) {
				soma += notas;
			}
			int media = soma / 3;
			if(media >= 6) {
				System.out.println("Aprovado");
			}
			else if(media < 6) {
				System.out.println("Reprovado");
			}
		}
	}
	
}
