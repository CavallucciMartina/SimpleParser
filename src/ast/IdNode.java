package ast;

public class IdNode implements Node {
	private STentry entry;
	private String id;
	public IdNode(String id, STentry st) {
		super();
		this.id = id;
		this.entry = st;
	}
	
	@Override
	public String toPrint(String indent) {
		return indent + "Id: " + id + "\n" + ((entry!=null) ? entry.toPrint(indent + "  "): " ");
	}

}
