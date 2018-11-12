public class FindingMissingNumberInArray
{  
  public int displayMissingNumber(int[] inputnumbers)
  {
	  int numberofintegrs=0;
	  int sumofintegers=0;
	  int n=inputnumbers.length()+1;
	  int Totalsum=n(n+1)/2;
	  for(int inputintegers:inputnumbers)
	  {
        sumofintegers=sumofintegers+inputintegers;
	  }
	  int missingnumber=Totalsum-sumofintegers;
	  return missingnumber;
  }
    public static void main(String[] args)
    {
	 int[] inputnumbers={1,2,3,4,5,7,8,9};
	FindingMissingNumberInArray fmn= new FindingMissingNumberInArray();
	int missingnumberfromarray=fmn.displayMissingNumber(inputnumbers);
	System.out.println("Missing integer is : "+missingnumberfromarray);
    }
}