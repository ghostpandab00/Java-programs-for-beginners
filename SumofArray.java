import java.util.Scanner;

public class SumofArray {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your limit");
	int limit=s.nextInt();
	int array[];
	array=new int[100];
	int sum=0;
	System.out.println("Enter your values");
	for(int i=0;i<limit;i++) {
		array[i]=s.nextInt();
	}
	for(int i=0;i<limit;i++) {
		sum=sum+array[i];
	}
	System.out.println("Sum of array values ="+sum);
}
}
