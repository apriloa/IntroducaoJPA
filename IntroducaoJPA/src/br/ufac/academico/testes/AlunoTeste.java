package br.ufac.academico.testes;


import java.util.*;

import br.ufac.academico.entidades.*;
import br.ufac.academico.repositorios.*;

public class AlunoTeste {

	public static void main(String[] args) {
		
		AlunoRepositorio ar = new AlunoRepositorio();
		List<Aluno> alunos;
		
		Aluno a1,a2,a3,a4,a5;
	
		
		a1 = new Aluno();
		a1.setNome("Laila");
		a1.setIdade(12);
		
		a2 = new Aluno();
		a2.setNome("Lucas");
		a2.setIdade(30);
		
		a3 = new Aluno();
		a3.setNome("Loiro");
		a3.setIdade(18);
		
		a4 = new Aluno();
		a4.setNome("Silvana");
		a4.setIdade(19);
		
		a5 = new Aluno();
		a5.setNome("João");
		a5.setIdade(13);
		

		ar.adicionar(a1);
		ar.adicionar(a2);
		ar.adicionar(a3);
		ar.adicionar(a4);
		ar.adicionar(a5);
		
//	a1=em.find(Aluno.class,2l);
//	
//	System.out.println("Aluno");
//	System.out.println(a1.getId());
//	System.out.println(a1.getNome());
//	
//	
//	a1.setNome("Maria do Bairro");
//	
//	em.getTransaction().begin();
//	em.merge(a1);
//	em.getTransaction().commit();
//	
//	a1=em.find(Aluno.class,3l);
//	
//	System.out.println("Aluno");
//	System.out.println(a1.getId());
//	System.out.println(a1.getNome());
//	
//	a2=em.find(Aluno.class,4l);
//	System.out.println("Aluno");
//	System.out.println(a2.getId());
//	System.out.println(a2.getNome());
//	
//	em.getTransaction().begin();
//	em.remove(a2);
//	em.getTransaction().commit();
//	
//
//	a2=em.find(Aluno.class,6l);
//	if(a2 != null) {
//	System.out.println("Aluno");
//	System.out.println(a2.getId());
//	System.out.println(a2.getNome());
//	}else {
//		System.out.printf("Aluno (id=%d) não foi encontrado", 4);
//	}
	
		alunos = ar.recuperarTodos();
		System.out.println("Listando todos os alunos");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		alunos = ar.recuperarTodosPorNome();
		System.out.println("Listando todos os alunos por ordem");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		alunos = ar.recuperarMenoresDeIdade();
		System.out.println("Listando todos os alunos menores de idade por ordem");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		alunos = ar.recuperarMaioresDeIdade();
		System.out.println("Listando todos os alunos maiores de idade por ordem");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		alunos = ar.recuperarAdolescentes();
		System.out.println("Listando todos os alunos que são adolescentes por ordem");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		alunos = ar.recuperarPorFaixaEtaria(15, 20);
		System.out.println("Listando todos os alunos entre 15 e 20 anos por ordem");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		
		alunos = ar.recuperarNomeContendo("s");
		System.out.println("Listando todos os alunos que possuem letra S");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		
		
		ar.encerrar();
	}

}
