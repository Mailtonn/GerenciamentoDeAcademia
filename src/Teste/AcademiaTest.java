package Teste;

import static org.junit.Assert.*;

import org.junit.Test;
import Fachada.AcademiaFacade;
import Model.Aluno;
import Model.Modalidade;
import Model.Professor;

public class AcademiaTest {
	
	private AcademiaFacade academia = new AcademiaFacade();

	@Test
	public void adicionarAluno() {
		
		Aluno aluno = criarAluno();
		academia.adicionarAluno(aluno);
		Aluno aux = academia.getAluno(0); // comparando com o aluno na posição 0 da lista
		assertEquals(aluno,aux);
	}
	
	@Test
	public void removerAluno() {
		
		Aluno aluno = criarAluno();
		academia.adicionarAluno(aluno);
		academia.removerAluno(aluno);
		assertEquals(0, academia.quantidadeDeAlunos());
	}
	
	@Test
	public void adicionarAlunoDiferente() {
		
		Aluno aluno = criarAluno();
		academia.adicionarAluno(aluno);
		aluno = criarAlunoAuxiliar();
		academia.adicionarAluno(aluno);
		Aluno aux = academia.getAluno(1);
		assertEquals(aluno, aux);
	}
	
	@Test
	public void quantidadeDeAlunos() {
		Aluno aluno = criarAluno();
		academia.adicionarAluno(aluno);
		Aluno aluno2 = criarAlunoAuxiliar();
		academia.adicionarAluno(aluno2);
		assertEquals(2, academia.quantidadeDeAlunos());
	}
	
	@Test
	public void adicionarProfessor() {
		
		Professor professor = criarProfessor();
		academia.adicionarProfessor(professor);
		Professor aux = academia.getprofessor(0);
		assertEquals(professor,aux);
	}
	
	@Test
	public void removerProfessor() {
		
		Professor professor = criarProfessor();
		academia.adicionarProfessor(professor);
		academia.removerProfessor(professor);
		assertEquals(0, academia.quantidadeDeProfessor());
	}
	
	@Test
	public void adicionarProfessorDiferente() {
		
		Professor professor = criarProfessor();
		academia.adicionarProfessor(professor);
		professor = criarProfessorAuxiliar();
		academia.adicionarProfessor(professor);
		Professor aux = academia.getprofessor(1);
		assertEquals(professor, aux);
	}
	
	@Test
	public void quantidadeDeProfessor() {
		Professor professor = criarProfessor();
		academia.adicionarProfessor(professor);
		Professor professor2 = criarProfessorAuxiliar();
		academia.adicionarProfessor(professor2);
		assertEquals(2, academia.quantidadeDeProfessor());
	}
	
	@Test
	public void adicionarModalidade() {
		
		Modalidade modalidade = criarModalidade();
		academia.adicionarModalidade(modalidade);
		Modalidade aux = academia.getModalidade(0);
		assertEquals(modalidade,aux);
	}
	
	@Test
	public void removerModalidade() {
		
		Modalidade modalidade = criarModalidade();
		academia.adicionarModalidade(modalidade);
		academia.removerModalidade(modalidade);
		assertEquals(0, academia.quantidadeDeModalidade());
	}
	
	@Test
	public void adicionarModalidadeDiferente() {
		
		Modalidade modalidade = criarModalidade();
		academia.adicionarModalidade(modalidade);
		modalidade = criarModalidadeAuxiliar();
		academia.adicionarModalidade(modalidade);
		Modalidade aux = academia.getModalidade(1);
		assertEquals(modalidade, aux);
	}
	
	@Test
	public void quantidadeDeModalidade() {
		Modalidade modalidade = criarModalidade();
		academia.adicionarModalidade(modalidade);
		Modalidade modalidade2 = criarModalidadeAuxiliar();
		academia.adicionarModalidade(modalidade2);
		assertEquals(2, academia.quantidadeDeModalidade());
	}
	

	public Aluno criarAluno(){
		
		Aluno aluno = new Aluno();
		aluno.setNome("Mailton");
		aluno.setEndereco("Rua A");
		aluno.setCpf(123456);
		aluno.setIdade(28);
		aluno.setMatricula(1);
		aluno.setModalidade("Musculação");
		return aluno;
	}
	
	public Aluno criarAlunoAuxiliar(){
		
		Aluno aluno = new Aluno();
		aluno.setNome("Heitor");
		aluno.setEndereco("Rua B");
		aluno.setCpf(000000);
		aluno.setIdade(30);
		aluno.setMatricula(2);
		aluno.setModalidade("Natação");
		return aluno;
	}
	
	public Professor criarProfessor(){
		
		Professor professor = new Professor();
		professor.setNome("Diego");
		professor.setEndereco("Rua C");
		professor.setCpf(111111);
		professor.setIdade(40);
		professor.setMatricula(3);
		return professor;
	}
	
	public Professor criarProfessorAuxiliar(){
		
		Professor professor = new Professor();
		professor.setNome("Rodrigo Vilar");
		professor.setEndereco("Rua D");
		professor.setCpf(222222);
		professor.setIdade(80);
		professor.setMatricula(4);
		return professor;
	}
	
	public Modalidade criarModalidade(){
		
		Modalidade modalidade = new Modalidade();
		modalidade.setCodigoDaModalidade(10);
		modalidade.setNomeDaModalidade("Musculação");
		modalidade.setValor(70);
		return modalidade;
	}
	
	public Modalidade criarModalidadeAuxiliar(){
		Modalidade modalidade = new Modalidade();
		modalidade.setCodigoDaModalidade(22);
		modalidade.setNomeDaModalidade("Natação");
		modalidade.setValor(70);
		return modalidade;
	}
	
}
