import java.util.Scanner;

public class NumberTree {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your limit");
	int limit=s.nextInt();
	for(int i=1;i<=limit;i++) {
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.print("\n");
	}
}
}
