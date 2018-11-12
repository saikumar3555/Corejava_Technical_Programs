import java.util.*;
public class FindingVowels
{
 public static void main(String[]args)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String inputString=s.nextLine();
	 FindingVowels fw=new FindingVowels();
	 int result=fw.numberOfVowels(inputString);
	 System.out.println("The number of vowels in given String is: "+result);
 }
   public int numberOfVowels(String inputString)
   {
	  int count=0;
	  for( int index=0;index<=inputString.length()-1;index++)
	  {
	    if(inputString.charAt(index)=='a' ||inputString.charAt(index)=='e'||inputString.charAt(index)=='i' ||inputString.charAt(index)=='o'||inputString.charAt(index)=='u') {
	  
		  
		  count++;
		  }
	  }
	  return count;
  }
}

