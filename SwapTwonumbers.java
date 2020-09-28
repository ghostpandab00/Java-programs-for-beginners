import java.util.Scanner;

public class SwapTwonumbers {
public static void main(String a[]) {
	System.out.println("Enter two numbers :");
	Scanner s=new Scanner(System.in);
	int num1=s.nextInt();
	int num2=s.nextInt();
	System.out.println("Entered numbers are :"+num1+" & "+num2);
	int temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("The swapped numbers are :"+num1+" & "+num2);
	
}
}
