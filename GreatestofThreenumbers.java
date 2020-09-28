import java.util.Scanner;

public class GreatestofThreenumbers {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter three numbers :");
	int num1=s.nextInt();
	int num2=s.nextInt();
	int num3=s.nextInt();
	if (num1>num2) {
		if(num1>num3) {
			System.out.println("Greatest number is "+num1);
		}else {
			System.out.println("Greatest number is "+num3);
		}
	}else if(num2>num3){
		System.out.println("Greatest number is "+num2);
				
	}else {
		System.out.println("Greatest number is "+num3);
	}
}
}
