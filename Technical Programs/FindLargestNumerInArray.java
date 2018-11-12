import java.util.Arrays;
public class FindLargestNumerInArray
{
 public static void main(String[] args)
 {
	 int largenumbers=0;
	 int[] numbers={23,45,67,23,45,98,99};
	 for(int element:numbers)
	 {
		 if(largenumbers<element)
		 {
			 largenumbers=element;
		 }
	 }
	 System.out.println("The Largest Number is "+largenumbers);
 }
}