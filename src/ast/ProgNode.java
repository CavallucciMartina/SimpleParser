package ast;

public class ProgNode implements Node {

		private Node exp;
		
	public ProgNode(Node exp) {
			super();
			this.exp = exp;
		}

	@Override
	public String toPrint(String indent) {
		return indent + "Progr \n" +
				exp.toPrint( indent + "  ");
	}

}
