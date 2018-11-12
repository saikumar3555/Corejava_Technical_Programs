import java.util.ArrayList;
import java.util.*;
public class PrimeFactors
{   
   
   public static void main(String[] args)
   {
	 
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the input number");
     int inputnumber=s.nextInt();
   //static int inputnumber=10;
     PrimeFactors pf=new PrimeFactors();
	 List list=pf.displayPrimeFactors(inputnumber);
	 System.out.println("The Prime Factors of "+inputnumber+" is "+list);
	 if(list.length()==2){
		 System.out.println(inputnumber+"is a prime number");
	 }else{
		 System.out.println(inputnumber+"is not a prime number");
	 }
   }
  public static List displayPrimeFactors(int inputnumber)
   {
	   List primefactors=new ArrayList();
       for(int number=1;number<=inputnumber;number++)
       {
	     if(inputnumber%number==0)
		 primefactors.add(number);
	     //inputnumber/=number;
        }
     return primefactors;   
   }
  
}