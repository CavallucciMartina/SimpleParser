package ast;
public class IfNode implements Node {

	private Node condition;
	private Node then;
	private Node else_;
	
	public IfNode(Node condition, Node then, Node else_) {
		super();
		this.condition = condition;
		this.then = then;
		this.else_ = else_;
	}

	@Override
	public String toPrint(String indent) {
		
		return indent + "If \n" + condition.toPrint(indent+ "  ")+
				then.toPrint(indent + "  ")+
				else_.toPrint(indent + "  ");
	}

}
