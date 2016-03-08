import java.util.Scanner;
public class SampleScanner {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the number");
	int user_input_number = scan.nextInt();
	
	
	System.out.println("the entered value is");
	System.out.print(user_input_number);
	
	Scanner scan1 = new Scanner (System.in);
	System.out.println("enter the double");
	double user_input_double = scan1.nextDouble();
	
	System.out.println("enter the double");
	System.out.print(user_input_double);
	
	Scanner scan2 = new Scanner (System.in);
	System.out.println("enter the char");
	String user_input_string = scan2.next();
	
	System.out.println("show the char");
	System.out.print(user_input_string);
	
	
	}

}
