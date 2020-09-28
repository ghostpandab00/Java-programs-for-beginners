import java.util.Scanner;

public class BasicMaths {
public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	 System.out.println("Enter two numbers :");
	 int num1=s.nextInt();
	 int num2=s.nextInt();
	 System.out.println(" 1 for Addition \n 2 for subtraction\n 3 for Multiplication\n 4 for Division\n Enter your choice :");;
	 int choice=s.nextInt();
	 if(choice==1) {
		 int result=num1+num2;
		 System.out.println("Result ="+result);
	 }else if(choice==2) {
		 int result=num1-num2;
		 System.out.println("Result ="+result);
	 }else if(choice==3) {
		 int result=num1*num2;
		 System.out.println("Result ="+result);
	 }else if(choice==4) {
		 int result=num1/num2;
		 System.out.println("Result ="+result);
	 }else {
		 System.out.println("You have entered wrong number");
	 }

}
}
