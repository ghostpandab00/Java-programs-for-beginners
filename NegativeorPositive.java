import java.util.Scanner;

public class NegativeorPositive {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number :");
	int num=s.nextInt();
	if (num<0) {
		System.out.println("Enetered number is negative");
	}else {
		System.out.println("Enetered number is positive");
	}
}
}
