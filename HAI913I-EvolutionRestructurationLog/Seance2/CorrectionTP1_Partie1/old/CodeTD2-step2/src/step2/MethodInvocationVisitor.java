package step2;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;

public class MethodInvocationVisitor extends ASTVisitor {
	List<MethodInvocation> methods = new ArrayList<>();
	List<SuperMethodInvocation> superMethods = new ArrayList<>();

	public List<MethodInvocation> getMethods() {
		return this.methods;
	}

	public List<SuperMethodInvocation> getSuperMethod() {
		return this.superMethods;
	}

	@Override
	public boolean visit(MethodInvocation node) {
		this.methods.add(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(SuperMethodInvocation node) {
		this.superMethods.add(node);
		return super.visit(node);
	}
}
