import java.util.Scanner;
public class SumOfNumbersInString
{
 public static void main(String[] args)
 {
	int sum=0;
	int count=0;
    String temp="";	
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the Line for Checking");
	String inputstring=s.nextLine();
	for(int index=0;index<=inputstring.length()-1;index++)
	{
		if(Character.isDigit(inputstring.charAt(index)))
		{
			temp=temp+(inputstring.charAt(index));
			count++;
		 }else{
			 if(temp!="")
			 {
			sum=sum+Integer.parseInt(temp);
			 temp="";
			 count++;
			 }
		}
		}
		System.out.println(+count);
		//if(Character.isDigit(charAt(count-1))){
		//string lastnumber=substring( temp,inputstring.length()-1);
		sum=sum+Integer.parseInt(temp);//}
	   System.out.println("sum of numbers from given String "+sum);
	
 }
}