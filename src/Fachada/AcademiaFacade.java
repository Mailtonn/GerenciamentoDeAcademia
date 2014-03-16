package Fachada;

import Gerenciamento.GerenciadorDeAluno;
import Gerenciamento.GerenciadorDeModalidade;
import Gerenciamento.GerenciadorDeProfessor;
import Gerenciamento.GerenciamentoDeFuncionario;
import Model.Aluno;
import Model.Funcionario;
import Model.Modalidade;
import Model.Professor;

public class AcademiaFacade {
	
	GerenciadorDeAluno gerenteAluno;
	GerenciadorDeProfessor gerenteProfessor;
	GerenciadorDeModalidade gerenteModalidade;
	GerenciamentoDeFuncionario gerenteFuncionario;
		
	public AcademiaFacade(){
		
		gerenteAluno =  new GerenciadorDeAluno();
		gerenteProfessor = new GerenciadorDeProfessor();
		gerenteModalidade = new GerenciadorDeModalidade();
		gerenteFuncionario = new GerenciamentoDeFuncionario();
	}
	
	public void adicionarAluno(Aluno aluno){
		gerenteAluno.adicionarAluno(aluno);
	}
	
	public void removerAluno(Aluno aluno){
		gerenteAluno.removerAluno(aluno);
	}
	
	public Aluno getAluno(int posicao){
		return gerenteAluno.getAluno(posicao);
	}
	
	public int quantidadeDeAlunos(){
		return gerenteAluno.quantidadeDeAluno();
	}
	
	public Aluno buscarAluno(int matricula){
		return gerenteAluno.buscarAluno(matricula);
	}
	
    public void atualizarAluno(Object alunoAntigo, Object alunoNovo){
	    gerenteAluno.atualizarAluno(alunoAntigo, alunoNovo);
    }
		
	public void adicionarProfessor(Professor professor){
		gerenteProfessor.adicionarProfessor(professor);
	}
	
	public void removerProfessor(Professor professor){
		gerenteProfessor.removerProfessor(professor);
	}
	
	public Professor getprofessor(int posicao){
		return gerenteProfessor.getProfessor(posicao);
	}
	
	public int quantidadeDeProfessor(){
		return gerenteProfessor.quantidadeDeProfessores();
	}
	
	 public void atualizarProfessor(Object profAntigo, Object profNovo){
		    gerenteProfessor.atualizarProfessor(profAntigo, profNovo);
	    }
	
	public void adicionarModalidade(Modalidade modalidade){
		gerenteModalidade.adicionarModalidade(modalidade);
	}
	
	public void removerModalidade(Modalidade modalidade){
		gerenteModalidade.removerModalidade(modalidade);
	}
	
	public Modalidade getModalidade(int posicao){
		return gerenteModalidade.getModalidade(posicao);
	}
	
	public int quantidadeDeModalidade(){
		return gerenteModalidade.quantidadeDeModalidade();
	}
	
	  public void atualizarModalidade(Object modalidadeAntiga, Object modalidadeNova){
		    gerenteModalidade.atualizarModalidade(modalidadeAntiga, modalidadeNova);
	    }
	  
	  public void adicionarFuncionario(Funcionario funcionario){
			gerenteFuncionario.adicionarFuncionario(funcionario);
		}
		
		public void removerFuncionario(Funcionario funcionario){
			gerenteFuncionario.removerFuncionario(funcionario);
		}
		
		public Funcionario getFuncionario(int posicao){
			return gerenteFuncionario.getFuncionario(posicao);
		}
		
		public int quantidadeDeFuncionario(){
			return gerenteFuncionario.quantidadeFuncionario();
		}
		
		public Funcionario buscarFuncionario(int matricula){
			return gerenteFuncionario.buscarFuncionario(matricula);
		}
		
	    public void atualizarFuncionario(Object funcAntigo, Object funcNovo){
		    gerenteFuncionario.atualizarFuncionario(funcAntigo, funcNovo);
	    }

}
