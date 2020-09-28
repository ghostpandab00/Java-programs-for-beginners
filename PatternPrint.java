import java.util.Scanner;

public class PatternPrint {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the limit");
	int limit=s.nextInt();

	for(int i=1;i<=limit;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("*\t");
		}
		System.out.print("\n");
	}
}
}
