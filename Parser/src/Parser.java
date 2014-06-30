import java.util.HashMap;


public class Parser {

	public HashMap<String,Object> Parse(String parseString)
	{
		HashMap Result=new HashMap();
		Stack Seperators=new Stack();
		StringBuilder sbr=new StringBuilder();
		char[] parseArray=parseString.toCharArray();
		for(int i=0;i<parseString.length();i++)		{
		 if ((parseArray[i]==':' && parseArray[i]==Seperators.peek();) || (parseArray[i]==',')  )
		 {
			 Seperators.peek();
			 Seperators.add(Value);
		 }
		}
		return Result;
	}
	

}	
