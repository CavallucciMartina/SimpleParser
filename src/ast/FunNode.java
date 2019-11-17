package ast;

import java.util.ArrayList;
import java.util.Optional;

public class FunNode implements Node {

	private String name;
	private Node type;// tipo di ritorno
	private Node exp; // body funzione
	private ArrayList<Node> declist = new ArrayList<Node>(); // potrebbe non esserci quinid vuota
	private ArrayList<Node> parlist = new ArrayList<Node>(); // potrebbe non esserci quinid vuota
	public FunNode(String name, Node type) {
		super();
		this.name = name;
		this.type = type;
		
	}
	
	public void addDec( ArrayList<Node> d) {
		declist = d;
	}
	public void paddPar( ArrayList<Node> d) {
		declist = d;
	}
	public void addBody(Node e ) {
		
		exp = e;
	}
	@Override
	public String toPrint(String indent) {
		//Da modificare !
		return indent + "Var: " + name + "\n" + type.toPrint(indent + " ")+ exp.toPrint(indent + "  ");
	}

}
