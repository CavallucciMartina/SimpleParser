package ast;

public class EqualNode implements Node {

	private Node left;
	private Node right;
	public EqualNode(Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
	}
	@Override
	public String toPrint(String indent) {
		return indent+"Equal\n" +left.toPrint(indent+" ") +
							right.toPrint(indent+ "  ");
	}

}
