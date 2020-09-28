import java.util.Scanner;

public class PassFail {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your mark :");
	int mark=s.nextInt();
	if (mark>=50) {
		System.out.println("You have passed");
	}else {
		System.out.println("You have failed");
	}
}
}
