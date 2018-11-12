import java.util.Scanner;
public class FibonacciSeries
{
   
  //System.out.pritnln(firstnumber+" "+nextnumber);
 public static void main(String[] args)
 {
   int firstnumber=0;
   int nextnumber=1;
   int sum=0;
   System.out.println("printing Fibonacci series for :");
   Scanner scanner=new Scanner(System.in);
   int inputNumber=scanner.nextInt();
   //int inputNumber=10;
   System.out.print(firstnumber+" "+nextnumber);
    
      
	  
        for(int number=1;number<=inputNumber;number++)
       {
         sum=firstnumber+nextnumber;
         System.out.print(" "+sum);
         firstnumber=nextnumber;
         nextnumber=sum;
		}
	  }
  }

