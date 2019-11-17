package ast;
public class STentry {

	//type
  private Integer nestingLevel;
  
  public STentry (Integer n) {
   nestingLevel= n;
  }
  
  public String toPrint(String s) {
   return s+"Stentry:nesting level: " + Integer.toString(nestingLevel) +"\n";  
  }
  
}  