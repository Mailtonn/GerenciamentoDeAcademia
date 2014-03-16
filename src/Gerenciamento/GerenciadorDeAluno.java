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
	
	   public void atualizarAluno(Object p1, Object p2) {
			for (int i = 0; i < this.listaAlunos.size(); i++) {
				if (this.listaAlunos.get(i).equals(p1)) {
					this.listaAlunos.set(i, (Aluno)p2);
				}
			}

		}
	
}
