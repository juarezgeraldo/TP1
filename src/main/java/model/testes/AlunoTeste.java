package model.testes;

import java.util.ArrayList;
import java.util.List;

import model.domain.Aluno;

public class AlunoTeste {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		
		Aluno aluno1 = new Aluno("Juarez", "juarez@gmail.com", "senha123");
		Aluno aluno2 = new Aluno("Maria", "maria@gmail.com", "senhaMaria123");
		Aluno aluno3 = new Aluno("João", "joao@gmail.com", "senhaJoal123");
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		System.out.println("Aluno: " + alunos.get(0).getEmail());
		
		System.out.println("Quantidade: " + alunos.size());
		for (Aluno aluno : alunos) {
			System.out.println("Aluno: " + aluno.getNome());
		}
	}

}
