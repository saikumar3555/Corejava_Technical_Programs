public class PositiveNumber
{
  public static void main(String[] args)
  {  
 //int inputnumber=123;
        for(int inputnumber=-3;inputnumber<=100;inputnumber++ )
        {
            if(inputnumber>0)
	        {
	           System.out.println(inputnumber + "  PositiveNumber");
		    }
			else if(inputnumber==0)
			{
				System.out.println(inputnumber + "  is Zero");
			}
     
            else
	        { 
		       System.out.println(inputnumber + "  Negative number");
            }
        }
    }
}

  
