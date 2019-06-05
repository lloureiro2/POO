public class CirculoEscalavel implements ObjetoGeometrico, Escalavel {
	/**
	 * Declara��o dos campos da classe
	 */
	private Ponto centro;
	private double raio;

	/**
	 * O construtor para a classe CirculoEscalavel, que recebe argumentos para
	 * inicializar todos os campos da classe. Este � o construtor "completo".
	 * 
	 * @param centro o centro do c�rculo (uma inst�ncia da classe Ponto2D)
	 * @param raio   o raio do c�rculo
	 */
	public CirculoEscalavel(Ponto _centro, double _raio) {
		this.centro = _centro; // Note o uso da palavra-chave this para marcar os campos
		this.raio = _raio; // da classe que tem o mesmo nome dos argumentos
	}

	/**
	 * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao centro
	 * do c�rculo. Neste caso, basta retornar a inst�ncia da classe Ponto2D que
	 * representa o pr�prio centro.
	 * 
	 * @return uma inst�ncia da classe Ponto2D representando o centro do c�rculo
	 */
	public Ponto centro() {
		return this.centro;
	}

	/**
	 * O m�todo calcula�rea calcula a �rea do c�rculo e retorna a �rea como um valor
	 * do tipo double.
	 * 
	 * @return a �rea deste c�rculo
	 */
	public double calcula�rea() {
		return Math.PI * raio * raio;
	}

	/**
	 * O m�todo calculaPer�metro calcula o per�metro do c�rculo e retorna o
	 * per�metro como um valor do tipo double.
	 * 
	 * @return o per�metro deste c�rculo
	 */
	public double calculaPer�metro() {
		return 2.0 * Math.PI * this.raio;
	}

	/**
	 * O m�todo amplia modifica o raio do c�rculo de acordo com o valor passado como
	 * argumento, efetivamente modificando o tamanho do c�rculo.
	 * 
	 * @param escala a escala para modifica��o do c�rculo
	 */
	public void amplia(double _escala) {
		this.raio *= _escala;
	}

	/**
	 * O m�todo espelha modifica o centro do c�rculo para alterar a sua posi��o
	 * (fazendo com que o c�rculo fique refletido nas suas coordenadas horizontais)
	 * @throws Exception 
	 */
	public void espelha() throws Exception {
		this.centro = new Ponto(this.centro.getX() * (-1), this.centro.getY());
	}

	/**
	 * O m�todo toString retorna os valores dos campos do c�rculo formatados em uma
	 * string.
	 * 
	 * @return uma string contendo uma representa��o dos campos do c�rculo
	 */
	public String toString() {
		// Retorna diretamente uma string criada com os valores dos campos. O m�todo
		// toString da classe Ponto2D � chamado implicitamente.
		return centro + "-" + this.raio;
	}

	@Override
	public ObjetoGeometrico clona() {
		CirculoEscalavel novo = new CirculoEscalavel(this.centro,this.raio);
		return novo;
	}
}