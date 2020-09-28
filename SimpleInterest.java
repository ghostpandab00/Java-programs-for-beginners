import java.util.Scanner;

public class SimpleInterest {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter pricipal amount");
	int P=s.nextInt();
	System.out.println("Enter interest rate");
	float R=s.nextFloat();
	System.out.println("Enter number of years");
	float N=s.nextFloat();
	float SI=(P*R*N)/100;
	System.out.println("Simplet interest is "+SI);
}
}
