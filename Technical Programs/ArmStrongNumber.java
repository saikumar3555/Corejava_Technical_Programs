public class ArmStrongNumber
{
	
	public void checkArmStrongNumber(int inputnumber)
	{
		int tempnumber=inputnumber;
		int sum=0;
		//String revString="";
		while(tempnumber>0)
		{
		   int rem=tempnumber%10;
		   sum=sum+(rem*rem*rem);
		   tempnumber =tempnumber/10;
		   
		}
		 
		if(inputnumber==sum)
		{
			  System.out.println(inputnumber + " is armstrong number");
		 }else {
			  System.out.println(inputnumber + " is not a armstrong number");
		}
			
	}
	public static void main(String[] args) 
	{
		String str=args[0];
		int inputnum=Integer.parseInt(str);
		ArmStrongNumber asn=new ArmStrongNumber();
		asn.checkArmStrongNumber(inputnum);
	}
}