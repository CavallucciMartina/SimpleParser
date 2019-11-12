package ast;

public class IntNode implements Node{

	private  int value; 
	
	public IntNode(int value) {
		super();
		this.value = value;
	}

	
	
	@Override
	public String toPrint(String indent) {
		return indent + "Int :" + value + "\n";
	}
}
