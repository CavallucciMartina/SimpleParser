package ast;
public class BoolNode implements Node {

	public BoolNode(boolean value) {
		super();
		this.value = value;
	}
	private boolean value;
	@Override
	public String toPrint(String indent) {
		if(value) return indent + "Bool:true\n";
		else return indent + "Bool:false\n";
	}

}
