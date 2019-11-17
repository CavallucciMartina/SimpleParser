package ast;
import java.util.ArrayList;

public class ProgLetInNode implements Node {

	private ArrayList<Node> declist;
	private Node exp;
	public ProgLetInNode(ArrayList<Node> declist, Node exp) {
		super();
		this.declist = declist;
		this.exp = exp;
	}

	@Override
	public String toPrint(String indent) {
		String declstr = "";
		for(Node dec: declist) {
			declstr += dec.toPrint(indent + "  ");
		}
		return indent+ "ProgLetIn\n" +declstr + exp.toPrint(indent + "  ");
	}

	
}
