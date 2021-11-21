package step2;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class VariableDeclarationFragmentVisitor extends ASTVisitor {
	private List<VariableDeclarationFragment> variables = new ArrayList<>();

	public List<VariableDeclarationFragment> getVariables() {
		return this.variables;
	}

	@Override
	public boolean visit(VariableDeclarationFragment node) {
		this.variables.add(node);
		return super.visit(node);
	}
}
