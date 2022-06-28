package interp;

public class Expressao extends ExpressaoAbstrata {
	
	private ExpressaoAbstrata expr;
	private ExpressaoAbstrata term; 
	
	
	
	public Expressao(ExpressaoAbstrata term) {
		super();
		this.term = term;
	}
	
	public Expressao(ExpressaoAbstrata expr, ExpressaoAbstrata term) {
		super();
		this.expr = expr;
		this.term = term;
	}

	@Override
	public int interpret() {
		if(expr == null) {
			return term.interpret();
		}else {
			return expr.interpret() + term.interpret();
		}
		
	}

}
