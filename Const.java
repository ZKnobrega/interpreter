package interp;

public class Const extends ExpressaoAbstrata{
	
	private int Valor;
	
	public Const(int valor) {
		this.Valor = valor;
	}

	@Override
	public int interpret() {
		return Valor;
	}

}
