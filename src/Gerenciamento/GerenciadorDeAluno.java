package Gerenciamento;

import java.util.ArrayList;
import java.util.List;
import Model.Aluno;

public class GerenciadorDeAluno {
	
	List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public void adicionarAluno(Aluno aluno){
		listaAlunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno){
		listaAlunos.remove(aluno);
	}
	
	public int quantidadeDeAluno(){
		return listaAlunos.size();
	}
	
	public Aluno getAluno(int posicao){
		return listaAlunos.get(posicao);
	}
	
	public Aluno buscarAluno(int matricula){
		for(Aluno aluno: listaAlunos){
			if(aluno.getMatricula() == matricula){
				return aluno;
			}
		}
		return null;
	}
	
}
