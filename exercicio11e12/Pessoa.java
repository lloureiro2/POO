package exercicio11e12;

import exercicio2.Data;

public class Pessoa {
	private String nome , identidade;
	private Data DNascimento;
	
//CONSTRUTORES
	public Pessoa(String _nome , String _identidade , Data _DNascimento ) {
		this.nome=_nome;
		this.identidade=_identidade;
		this.DNascimento=_DNascimento;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String _nome) {
		this.nome = _nome;
	}


	public String getIdentidade() {
		return this.identidade;
	}


	public void setIdentidade(String _identidade) {
		this.identidade = _identidade;
	}


	public Data getDNascimento() {
		return this.DNascimento;
	}


	public void setDNascimento(Data _dNascimento) {
		this.DNascimento = _dNascimento;
	}


	@Override
	public String toString() {
		return "nome=" + this.getNome() + ", identidade=" + this.getIdentidade() + ", DNascimento=" + this.getDNascimento();
	}
}
