package Teste;

import static org.junit.Assert.*;

import org.junit.Test;
import Fachada.AcademiaFacade;
import Model.Aluno;
import Model.Funcionario;
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
	public void atualizarAluno() {
		
		Aluno aluno1 = criarAluno(); 
		academia.adicionarAluno(aluno1); 
		Aluno aluno2 = criarAlunoAuxiliar();
		academia.atualizarAluno(aluno1, aluno2); 
		assertEquals(aluno2, academia.getAluno(0));	
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
	public void atualizarProfessor() {
		
		Professor professor1 = criarProfessor(); 
		academia.adicionarProfessor(professor1); 
		Professor professor2 = criarProfessorAuxiliar();
		academia.atualizarProfessor(professor1, professor2); 
		assertEquals(professor2, academia.getprofessor(0));	
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
	
	@Test
	public void atualizarModalidade() {
		
		Modalidade modalidade1 = criarModalidade(); 
		academia.adicionarModalidade(modalidade1); 
		Modalidade modalidade2 = criarModalidadeAuxiliar();
		academia.atualizarModalidade(modalidade1, modalidade2); 
		assertEquals(modalidade2, academia.getModalidade(0));	
	}
	
	@Test
	public void adicionarFuncionario() {
		
		Funcionario funcionario = criarFuncionario();
		academia.adicionarFuncionario(funcionario);
		Funcionario aux = academia.getFuncionario(0);
		assertEquals(funcionario,aux);
	}
	
	@Test
	public void removerFuncionario() {
		
		Funcionario funcionario = criarFuncionario();
		academia.adicionarFuncionario(funcionario);
		academia.removerFuncionario(funcionario);
		assertEquals(0, academia.quantidadeDeFuncionario());
	}
	
	@Test
	public void adicionarFuncionarioDiferente() {
		
		Funcionario funcionario = criarFuncionario();
		academia.adicionarFuncionario(funcionario);
		funcionario = criarFuncionarioAuxiliar();
		academia.adicionarFuncionario(funcionario);
		Funcionario aux = academia.getFuncionario(1);
		assertEquals(funcionario, aux);
	}
	
	@Test
	public void quantidadeDeFuncionario() {
		
		Funcionario funcionario = criarFuncionario();
		academia.adicionarFuncionario(funcionario);
		Funcionario funcionario2 = criarFuncionarioAuxiliar();
		academia.adicionarFuncionario(funcionario2);
		assertEquals(2, academia.quantidadeDeFuncionario());
	}
	
	@Test
	public void atualizarFuncionario() {
		
		Funcionario funcionario = criarFuncionario(); 
		academia.adicionarFuncionario(funcionario); 
		Funcionario funcionario2 = criarFuncionarioAuxiliar();
		academia.atualizarFuncionario(funcionario, funcionario2); 
		assertEquals(funcionario2, academia.getFuncionario(0));	
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
	
	public Funcionario criarFuncionario(){
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Diego");
		funcionario.setEndereco("Rua x");
		funcionario.setCpf(444444);
		funcionario.setMatricula(5);
		funcionario.setFuncao("faxineiro");
		return funcionario;
	}
	
	public Funcionario criarFuncionarioAuxiliar(){
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("João");
		funcionario.setEndereco("Rua Y");
		funcionario.setCpf(555555);
		funcionario.setMatricula(6);
		funcionario.setFuncao("Copeiro");
		return funcionario;
	}
	
}
