import java.util.Scanner;

public class GreatestNumber {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1=s.nextInt();
	int num2=s.nextInt();
	if(num1>num2) {
		System.out.println("Greatest number is "+num1);
	}else {
		System.out.println("Greatest number is "+num2);
	}
}
}
