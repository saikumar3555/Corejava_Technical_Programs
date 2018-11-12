import java.util.Scanner;
public class SumOfDigitsInString
{
 public static void main(String[] args)
 {
	 int sum=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Line for Checking");
	 String inputstring=s.nextLine();
	 for(int index=0;index<=inputstring.length()-1;index++)
	 {
	   if (Character.isDigit(inputstring.charAt(index)))
	   {
		   int digit=Integer.parseInt(inputstring.charAt(index)+"");
		   //sum=sum+Integer.parseInt(inputstring.charAt(index)+"");
		   sum=sum+digit;
	   }
	 }
	 System.out.println("The sum of Digits in Given String is "+sum);
 }
}