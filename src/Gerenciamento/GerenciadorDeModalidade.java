package Gerenciamento;

import java.util.ArrayList;
import java.util.List;
import Model.Modalidade;

public class GerenciadorDeModalidade {
	
	List<Modalidade> listaModalidade = new ArrayList<Modalidade>();
	
	public void adicionarModalidade(Modalidade modalidade){
		listaModalidade.add(modalidade);
	}
	
	public void removerModalidade(Modalidade modalidade){
		listaModalidade.remove(modalidade);
	}
	
	public int quantidadeDeModalidade(){
		return listaModalidade.size();
	}
	
	public Modalidade getModalidade(int posicao){
		return listaModalidade.get(posicao);
	}
	
	public Modalidade buscarModalidade(int codigoDaModalidade){
		for(Modalidade modalidade: listaModalidade){
			if(modalidade.getCodigoDaModalidade() == codigoDaModalidade){
				return modalidade;
			}
		}
		return null;
	}
	
	 public void atualizarModalidade(Object p1, Object p2) {
			for (int i = 0; i < this.listaModalidade.size(); i++) {
				if (this.listaModalidade.get(i).equals(p1)) {
					this.listaModalidade.set(i, (Modalidade)p2);
				}
			}

		}

}
