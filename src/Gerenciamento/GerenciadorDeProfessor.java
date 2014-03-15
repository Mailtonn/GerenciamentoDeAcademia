package Gerenciamento;

import java.util.ArrayList;
import java.util.List;
import Model.Professor;

public class GerenciadorDeProfessor {
	
	List<Professor> listaProfessores = new ArrayList<Professor>();
	
	public void adicionarProfessor(Professor professor){
		listaProfessores.add(professor);
	}
	
	public void removerProfessor(Professor professor){
		listaProfessores.remove(professor);
	}
	
	public Professor getProfessor(int posicao){
		return listaProfessores.get(posicao);
	}
	
	public int quantidadeDeProfessores(){
		return listaProfessores.size();
	}
	
	public Professor buscarProfessor(int matricula){
		for(Professor professor: listaProfessores){
			if(professor.getMatricula() == matricula){
				return professor;
			}
		}
		return null;
	}

}
