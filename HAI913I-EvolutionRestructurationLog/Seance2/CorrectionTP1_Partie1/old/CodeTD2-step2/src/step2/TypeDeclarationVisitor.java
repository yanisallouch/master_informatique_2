package step2;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class TypeDeclarationVisitor extends ASTVisitor {
	List<TypeDeclaration> types = new ArrayList<>();

	public List<TypeDeclaration> getTypes() {
		return this.types;
	}

	@Override
	public boolean visit(TypeDeclaration node) {
		this.types.add(node);
		return super.visit(node);
	}
}
