
class Node
{
	private Object Data;
	private Node Next;
	public Node(Object Data,Node Next)
	{
		this.Data=Data;
		this.Next=Next;
		
	}
	public Node next()
	{
		return Next;
	}
	
}
public class Stack {
	
      private Node head;
      
      public Node pop()
      {
    	  Node temp=head;
    	  head=head.next();
    	  return temp;
    	  
      }
      public void add(Object Value)
      {
    	  if (head==null)
    	  {
    		  Node temp=new Node(Value,null);
    		  head=temp;
    		  return;
    	  }
    			  
    	  Node temp=new Node(Value,head);
    	  head=temp;
      }
      public Node peek()
      {
    	 return head;
      }
	
}
