import java.util.Scanner;
public class Caluclator{

public int Addition(int number1,int number2){
	int result=number1+number2;
	return result;
}
public static void main(String []args){
	Scanner sc=new Scanner();
	int number1=sc.nextInt();
	int number2=sc.nextInt();
	int result=new Addition(number1,number2);
	
}
}