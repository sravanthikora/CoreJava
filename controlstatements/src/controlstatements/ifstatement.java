package controlstatements;
import java.util.Scanner;

public class ifstatement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you are eligible to vote");
		}
		else{
			System.out.println("not eligible to vote");
		}
	}

}

