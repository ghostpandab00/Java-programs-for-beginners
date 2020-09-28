import java.util.Scanner;

public class SwitchSample {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	System.out.println(" 1 for porotta\n 2 for biriyani\n 3 for mandhi\n 4 for fried rice");
	int choice=s.nextInt();
	switch(choice) {
	case 1:
		System.out.println("You have selected porotta");
		break;
	case 2:
		System.out.println("You have selected biriyani");
		break;
	case 3:
		System.out.println("You have selected mandhi");
		break;
	case 4:
		System.out.println("You have selected fried rice");
		break;
	default:
		System.out.println("You have selected wrong item");
	}
}
}
