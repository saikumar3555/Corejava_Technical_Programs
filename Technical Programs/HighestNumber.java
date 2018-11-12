public class HighestNumber
{
 public static void main(String[]args)
 {
   int[] inputArray={1,2,3,4,5,6,7,8,9,10};
   int sum=0;
   //for(int index=0;index<=inputArray;index++)
   for(int e:inputArray){
	   System.out.println("The Elements in the Array "+e);
   sum += e;}
   //System.out.println("The Elements in the Array "+e);
	System.out.println("sum is "+sum);
	   
   
	 
  }
}