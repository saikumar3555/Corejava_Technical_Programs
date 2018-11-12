import java.util.List;
import java.util.ArrayList;
public class PalindromeRangeLimitDemo
{
	
	public List<Integer> findPalimdromNumberForGivenRange(int startRange , int maxRange)
	{
		List<Integer> palindromeNumbersList = new ArrayList<Integer>();
		for(int inputNum = startRange ; inputNum <= maxRange ; inputNum++ ){
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
				palindromeNumbersList.add(inputNum);
			}
			
		}
		return palindromeNumbersList;
		
		
	}
	public static void main(String[] args)
	{
		String startRange=args[0];
		String endRange=args[1];
		int startNumber=Integer.parseInt(startRange);
		int endNumber=Integer.parseInt(endRange);
		PalindromeRangeLimitDemo ref  = new PalindromeRangeLimitDemo();
		List<Integer> palimdromNumbers = ref.findPalimdromNumberForGivenRange(startNumber,endNumber);
		System.out.println(palimdromNumbers.toString());
		
	}
}