import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class PrimeNumberDemo
{
public static void main(String[] args)
{
	 List<Integer> primeNumbers = new ArrayList<Integer>();
	for(int number=500;number<=1000;number++)
	{
		 Set<Integer> dividers = new HashSet<Integer>();
   
	   for(int divider = 1 ; divider <=number ; divider++){
		   int rem = number%divider;
		   if(rem == 0){
			   dividers.add(divider);
		   }
	   }
 //  System.out.println("SIZE : "+dividers.toString());
   if(dividers.size() == 2){
	   primeNumbers.add(number);
	 //  System.out.println(number + " is Prime number");
   }else {
	   // System.out.println(number + " is not Prime number");
   }
   
   
 
 
	}
	System.out.println("Prime numbers between 1 and 500 are : "+primeNumbers.toString());
	
		
		
		
	
}
}
