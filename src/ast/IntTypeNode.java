package ast;

public class IntTypeNode implements Node {

	@Override
	public String toPrint(String indent) {
		return indent + "IntType:\n";
	}

}
