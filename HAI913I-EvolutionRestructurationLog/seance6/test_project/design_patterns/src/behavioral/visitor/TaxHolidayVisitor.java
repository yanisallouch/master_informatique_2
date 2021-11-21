package behavioral.visitor;

/**
 * A TaxHolidayVisitor concrete class that plays the role 
 * of a ConcreteVisitor in the Visitor design pattern.<br/>
 * It's a visitor which allows to compute holiday taxes on different 
 * concrete products, namely Liquor, Tobacco, and Necessity objects.
 * @author anonbnr
 */
public class TaxHolidayVisitor extends TaxVisitor {
	
	/* METHODS */
	@Override
	public void visit(Liquor liquor) {
		taxRate = 0.10;
		computeTax(liquor);
	}
	
	@Override
	public void visit(Tobacco tobacco) {
		taxRate = 0.30;
		computeTax(tobacco);
	}
}