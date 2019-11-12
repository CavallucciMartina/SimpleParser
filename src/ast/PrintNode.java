package ast;
public class PrintNode implements Node {
	private Node value;
	public PrintNode(Node value) {
		super();
		this.value = value;
	}

	@Override
	public String toPrint(String indent) {
		return indent + "Print \n" + value.toPrint(indent+ "  ");
	}

}
