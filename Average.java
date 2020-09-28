import java.util.Scanner;

public class Average {
public static void main(String a[]) {
	System.out.println("Enter two numbers :");
	Scanner s=new Scanner(System.in);
	float num1=s.nextFloat();
	float num2=s.nextFloat();
	float average=(num1+num2)/2;
	System.out.println("Average of two numbers="+average);
}
}
