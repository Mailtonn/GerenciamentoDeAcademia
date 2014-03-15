package Model;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String modalidade;
	
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

}
