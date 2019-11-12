package ast;

public class PlusNode implements Node{
	
	private Node left;
	private Node right;

	
	public PlusNode(Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
	}


	@Override
	public String toPrint(String indent) {
		return indent+"Plus\n" +left.toPrint(indent+"  ")+
				right.toPrint(indent + "  ");
				
	}

}
