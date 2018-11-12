import java.util.Scanner;
import java.util.*;
public class FindDuplicateWords
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Input Line");
		String Line=s.nextLine();
		String[] words=Line.split(" ");
		HashMap<String,Integer> wordmap=new HashMap<String,Integer>();
		for(String str:words)
		{
			if(wordmap.get(str)!=null)
			{
				wordmap.put(str,wordmap.get(str) +1);
			}else{
				wordmap.put(str,1);
			}
		}
		Set<String> str2=wordmap.keySet();
	     for(String str :str2)
		 {
			 if(wordmap.get(str)>1){
			 System.out.println("words  "+str+" Repeted "+wordmap.get(str)+"  times");
			 }
		 }
	}
}