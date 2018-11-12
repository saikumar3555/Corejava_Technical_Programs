import java.util.*;
public class FindAverage
{
 public static double average(double number1,double number2,double number3)
 {
    return(number1+number2+number3)/3; 
	
 
 } 
 public static void main(String[] args)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the first number");
	 double number1=s.nextDouble();
	 System.out.println("Enter the second number");
	 double number2=s.nextDouble();
	 System.out.println("Enter the third number");
	 double number3=s.nextDouble();
	 //FindAverage favg =new FindAverage();
	 //double ss=FindAverage.average(number1,number2,number3);
	 System.out.println("The average is "+average(number1,number2,number3));
 }
}