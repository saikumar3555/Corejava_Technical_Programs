public class SearchNameInGivenArray
{
	public String[] getNames()
	{
		String[] names={"sai","kumar","duvva","ramesh"};
		return names;
	}
	public String findName(String[] names,String findName)
	{
		String returnValue = "NO";
		for(int index=0;index<=names.length-1;index++)
		{
			String name=names[index];
			if(name.equals(findName))
			{
				returnValue = "YES";
			}
		}
		return returnValue;
	}
	public static void main(String[] args) 
	{
		
		 SearchNameInGivenArray sa=new SearchNameInGivenArray();
		 String[] names=sa.getNames();
		 
		String str=args[0];
		String nameFound = sa.findName( names,str);
		System.out.println(nameFound);
		
	
	}
}