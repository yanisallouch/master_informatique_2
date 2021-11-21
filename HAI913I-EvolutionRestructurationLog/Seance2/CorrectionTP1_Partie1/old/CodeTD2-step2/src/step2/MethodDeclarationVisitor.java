package step2;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethodDeclarationVisitor extends ASTVisitor {
	List<MethodDeclaration> methods = new ArrayList<>();

	public List<MethodDeclaration> getMethods() {
		return this.methods;
	}

	@Override
	public boolean visit(MethodDeclaration node) {
		this.methods.add(node);
		return super.visit(node);
	}
}
