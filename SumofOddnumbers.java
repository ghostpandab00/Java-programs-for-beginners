import java.util.Scanner;

public class SumofOddnumbers {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your limit");
	int limit=s.nextInt();
	int sum=0;
	for(int i=1;i<=limit;i=i+2){
		sum=sum+i;
	}
	System.out.println("Sum of odd numbers="+sum);
	
}
}
