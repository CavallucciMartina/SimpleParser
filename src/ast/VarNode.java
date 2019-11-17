package ast;

public class VarNode implements Node {



	private String name;
	private Node type;
	private Node exp;
	public VarNode(String name, Node type, Node exp) {
		super();
		this.name = name;
		this.type = type;
		this.exp = exp;
	}
	@Override
	public String toPrint(String indent) {
		return indent + "Var: " + name + "\n" + type.toPrint(indent + " ")+ exp.toPrint(indent + "  ");
	}

}
