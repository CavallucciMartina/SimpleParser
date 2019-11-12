package ast;

public class MultNode implements Node {


	private Node left;
	private Node right;
	
	public MultNode(Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
	}

	
	@Override
	public String toPrint(String indent) {
		return indent+"Mult\n" +left.toPrint(indent+"  ")+
				right.toPrint(indent + "  ");
				
	}

}
