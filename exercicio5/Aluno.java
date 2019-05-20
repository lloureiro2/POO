package exercicio5;

public class Aluno {
	private String nome;
	private double nota1, nota2, media, pontos, limite;
	
	// quatro construtores sobrecarregados
	
	public Aluno(String _nome,double _nota1,double _nota2,double _pontos,double _limite) {
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
		
	}
	public Aluno(double _nota1, double _nota2, double _pontos, double _limite) {
		this("sem nome", _nota1, _nota2, _pontos, _limite);
	}
	public Aluno(double _nota1, double _nota2, double _limite) {
		this(_nota1, _nota2, 0.0, _limite);
	}
	public Aluno() {
		this(0.0,0.0,0.0);
	}
	
	// m�todos de interface para acesso aos campos privados
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public double getNota1() {
		return this.nota1;
	}
	public double getNota2() {
		return this.nota2;
	}
	public double getMedia() {
		return this.media;
	}
	public double getPontos() {
		return this.pontos;
	}
	public double getLimite() {
		return this.limite;
	}	

	// tratamento de erro ainda inadequado, ser� melhorado mais adiante
	
	public boolean setNotas(double _nota1, double _nota2, double _pontos, double _limite) {
		this.pontos = _pontos;
		this.limite = _limite;
		if(_nota1>=0 && _nota1<=_limite && _nota2>=0 && _nota2<=_limite) {
			this.nota1 = _nota1;
			this.nota2 = _nota2;
			this.calculaMedia(_limite);
			return true;
		}
		else
			return false;
	}
	public void setNotas(double _nota1, double _nota2, double _limite) {
		this.setNotas(_nota1, _nota2, 0, _limite);
	}
	
	// m�todo para calcular a m�dia. Privado pois o uso � apenas interno a classe
	
	private double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
		return this.media;
	}
	
	// sobrecarregamento do c�lculo da m�dia para limitar o valor m�ximo
	
	private double calculaMedia(double _limite) {
		this.calculaMedia();
		if(this.media > _limite)
			this.media = _limite;
		return this.media;
	}
	
	// n�o � adequado que o m�todo toString exiba mensagens, pois
	// � comum considerar que o programador de classes n�o conhece o usu�rio final
	// Evita-se tamb�m textos retornados, escritos em uma determinada l�ngua.
	
	public String toString(){
		return this.getNome()+";"
				+this.getNota1()+";"
				+this.getNota2()+";"
				+this.getPontos()+";"
				+this.getMedia();
	}
}
