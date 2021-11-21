package step2;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.SimpleName;

public class FieldAccessVisitor extends ASTVisitor {
	List<SimpleName> fields = new ArrayList<>();

	public List<SimpleName> getFields() {
		return this.fields;
	}

	@Override
	public boolean visit(SimpleName node) {
		if (!node.isDeclaration() && (node.resolveBinding() instanceof IVariableBinding)) {
			this.fields.add(node);
		}
		return super.visit(node);
	}
}
