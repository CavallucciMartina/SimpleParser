package ast;
public class PrintNode implements Node {

  private Node val;
  
  public PrintNode (Node v) {
   val=v;
  }
  
  public String toPrint(String s) {
   return s+"Print\n" + val.toPrint(s+"  ") ;
  }
      
}  