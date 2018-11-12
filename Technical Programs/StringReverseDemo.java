public class StringReverseDemo{
   
   public String reverseString(String inputString){
	   
	  char[] chars = inputString.toCharArray();
	  String revString= "";
	  
	   for(int i=chars.length-1 ; i>=0 ; i--){
		 char ch = chars[i];
		 revString = revString + ch;
	  }
	  
    
	  return revString;
   
   }
   
   public static void main(String args[]){
	   String inputString = args[0];
	   StringReverseDemo  stringReverseDemo = new StringReverseDemo();
	   String revereString = stringReverseDemo.reverseString(inputString);
	   System.out.println(revereString);
   }

}