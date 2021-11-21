package behavioral.visitor;

/**
 * A TaxVisitor concrete class that plays the role 
 * of a ConcreteVisitor in the Visitor design pattern.<br/>
 * It's a visitor which allows to compute taxes on different 
 * concrete products, namely Liquor, Tobacco, and Necessity objects.
 * @author anonbnr
 */
public class TaxVisitor implements Visitor {
	
	/* ATTRIBUTES */	
	/**
	 * The current visited product's computed tax.
	 */
	protected double computedTax;
	
	/**
	 * The current visited product's tax ratio.
	 */
	protected double taxRate;

	/* METHODS */
	/**
	 * Gets the computed tax for the currently visited product
	 * @return the computed tax for the currently visited product
	 */
	public double getComputedTax() {
		return computedTax;
	}
	
	/**
	 * Gets the taxRate for the currently visited product.
	 * @return the taxRate for the currently visited product.
	 */
	public double getTaxRate() {
		return taxRate;
	}
	
	/**
	 * Computes the tax for product using taxRate.
	 * @param product The visited Product for which we wish
	 * to compute the tax.
	 * @param taxRate The tax rate used to compute the tax for
	 * product.
	 */
	protected void computeTax(Product product) {
		System.out.println(product.getClass().getSimpleName() + " item: Price with Tax");
		computedTax = product.getPrice() * (1 + taxRate);
	}
	
	/**
	 * Computes the tax for a Liquor product.
	 */
	@Override
	public void visit(Liquor liquor) {
		taxRate = 0.18;
		computeTax(liquor);
	}

	/**
	 * Computes the tax for a Tobacco product.
	 */
	@Override
	public void visit(Tobacco tobacco) {
		taxRate = 0.32;
		computeTax(tobacco);
	}

	/**
	 * Computes the tax for a Necessity product.
	 */
	@Override
	public void visit(Necessity necessity) {
		taxRate = 0;
		computeTax(necessity);
	}
}