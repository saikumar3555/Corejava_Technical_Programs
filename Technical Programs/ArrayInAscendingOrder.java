import java.util.Arrays;
public class ArrayInAscendingOrder
{
 public static void main(String[] args)
 {
	 int[] numbers={23,87,67,23,45,98,99};
	 for(int eachnum:numbers)
	 {
	 System.out.print("The input Array Before Sort "+eachnum);
	 }
	 
	 //System.out.println("The input Array Before Sort "+numbers);
	 Arrays.sort(numbers);
	 for(int elements:numbers)
	 {
	 System.out.print("After Sorting "+elements);
	 }
 }
}