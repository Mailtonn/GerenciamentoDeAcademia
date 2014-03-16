package Gerenciamento;

import java.util.ArrayList;
import java.util.List;
import Model.Funcionario;

public class GerenciamentoDeFuncionario {
	
List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	
	public void adicionarFuncionario(Funcionario funcionario){
		listaFuncionarios.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario){
		listaFuncionarios.remove(funcionario);
	}
	
	public int quantidadeFuncionario(){
		return listaFuncionarios.size();
	}
	
	public Funcionario getFuncionario(int posicao){
		return listaFuncionarios.get(posicao);
	}
	
	public Funcionario buscarFuncionario(int matricula){
		for(Funcionario funcionario: listaFuncionarios){
			if(funcionario.getMatricula() == matricula){
				return funcionario;
			}
		}
		return null;
	}
	
	   public void atualizarFuncionario(Object p1, Object p2) {
			for (int i = 0; i < this.listaFuncionarios.size(); i++) {
				if (this.listaFuncionarios.get(i).equals(p1)) {
					this.listaFuncionarios.set(i, (Funcionario)p2);
				}
			}

		}
}
