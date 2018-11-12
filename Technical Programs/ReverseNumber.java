public class ReverseNumber
{
 public int reverseNumber( int inputnumber)
  {
	  String reverseNumberInString="";
			 while(inputnumber >0)
			 {
				int reminder =inputnumber%10;
				 reverseNumberInString= reverseNumberInString+reminder;
				  inputnumber=inputnumber/10;
				 
			 }
			 //System.out.println(reversenumber);
			 
			int revnumber= Integer.parseInt(reverseNumberInString);
			return revnumber;
  }
	 	


 public static void main(String[] args)
 {
	 String inputString = args[0];
	 int inputNumber = Integer.parseInt(inputString);
	 ReverseNumber ref=new ReverseNumber();
	int reverseNumber= ref.reverseNumber(inputNumber);
	System.out.println(inputNumber + "  reverse number is " +reverseNumber);
 }
}
 