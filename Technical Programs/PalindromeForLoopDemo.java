public class PalindromeForLoopDemo
{
	public void isPalindromeNumber()
	{
		for(int inputNum=121;inputNum<=300;inputNum++)
		{
			int tempNum = inputNum;
			String reverseStr="";
			while(tempNum >0)
			{
				int rem=tempNum%10;
				reverseStr=reverseStr+rem;
				tempNum=tempNum/10;
				
			}
			
			int revStr=Integer.parseInt(reverseStr);
			if(inputNum==revStr)
			{
				System.out.println(inputNum +" is palindrome number ");
			}
			else
			{
				System.out.println(inputNum +" is not a palindrome number ");
			}
		}
	}
	public static void main(String[] args)
	{
		//String inputString=args[0];
		//int inputnumber=Integer.parseInt(inputString);
		PalindromeForLoopDemo ref  = new PalindromeForLoopDemo();
		ref.isPalindromeNumber();
		
	}
}