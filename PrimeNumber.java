import java.util.Scanner;

public class PrimeNumber {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=s.nextInt();
	int flag=0;
	for(int i=1;i<num/2;i++) {
		if(num%i==0) {
			flag=1;
			break;
		}
	}
	if(flag==0) {
		System.out.println("Number is prime");
	}else {
		System.out.println("Number is not prime");
	}
}
}
