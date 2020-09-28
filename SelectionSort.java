import java.util.Scanner;

public class SelectionSort {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=s.nextInt();
	int array[];
	array= new int[100];
	int temp;
	System.out.println("Enter values of array");
	for(int i=0;i<size;i++) {
		array[i]=s.nextInt();
	}
	for(int i=0;i<size-1;i++) {
		for(int j=i+1;j<size;j++) {
			if(array[i]>array[j]) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			}
		}
	}
	System.out.println("The sorted array is");
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+"\t");
		
	}
}
}
