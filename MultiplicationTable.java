import java.util.Scanner;

public class MultiplicationTable {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=s.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(i+ "*" +num+ "=" +i*num);

	}
}
}
