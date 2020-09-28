import java.util.Scanner;

public class ArrayInput {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your limit");
	int limit=s.nextInt();
	int array[];
	array=new int[100];
	for(int i=0;i<limit;i++) {
		array[i]=s.nextInt();
			}
	System.out.println("Entered values are");
	for(int i=0;i<limit;i++) {
		System.out.println(array[i]);
	}

}
}
