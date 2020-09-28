import java.util.Scanner;

public class Sum_of_Two_numbers {
public static void main(String a[]) {
	System.out.println("Enter two numbers :");
	Scanner s=new Scanner(System.in);
	int num1=s.nextInt();
	int num2=s.nextInt();
	int sum=num1+num2;
	System.out.println("The sum of numbers="+sum);
}
}
