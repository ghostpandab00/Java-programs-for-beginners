import java.util.Scanner;

public class ArraySearch {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your limit");
	int limit=s.nextInt();
	int array[];
	array=new int[100];
	System.out.println("Enter array values");
	for(int i=0;i<limit;i++) {
		array[i]=s.nextInt();
	}
	System.out.println("Enter search key");
	int searchKey=s.nextInt();
	
	int i,flag=0;
	for(i=0;i<limit;i++) {
		if(searchKey==array[i]) {
			flag=1;
			
		}

	}
	if(flag==1) {
	System.out.println("Key found at position "+(i+1));
	}else {
		System.out.println("Key not found");
	}

}
}
