public class SumDemo
{
 public int sum(int firstNum,int secondNum, int thirdNum )
 {
  int sum =  firstNum + secondNum + thirdNum;
   return sum;
  
 }
 public static void main(String[] args)
 {
	 int a = Integer.parseInt(args[0]);
	 int b = Integer.parseInt(args[1]);
	 int c = Integer.parseInt(args[2]);
 SumDemo obj=new SumDemo();
 int sum=obj.sum(a,b,c);
 System.out.println("Sum of "+a +","+b +","+c+ " is "+sum);
 
 String name = args[3];
  String phoneNumber = args[4];
  System.out.println(name +" phone number is "+ phoneNumber);
 
 }
}