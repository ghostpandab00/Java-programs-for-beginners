import java.util.Scanner;

public class EvenNumbers {
public static void main(String a[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of array ");
	int size=s.nextInt();
	int array[];
	int count=0;
	array=new int[100];
	System.out.println("Enter elements of array");
	for(int i=0;i<size;i++) {
		array[i]=s.nextInt();
	}
	for(int i=0;i<size;i++) {
		if(array[i]%2==0) {
			count++;
		}
		}
	System.out.println("Number of even numbers="+ count);
}
}
