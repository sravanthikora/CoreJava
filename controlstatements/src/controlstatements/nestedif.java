package controlstatements;
import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter height and weight");
		float w=sc.nextFloat();
		float h=sc.nextFloat();
		int age=sc.nextInt();
		if(w<=65&&w>=55) {
			if(h<=6&&h>=5.6) {
				if(age>18&&age<=50) {
					System.out.println("selected for miss india");
			}
		}
		}
		else {
		 if (w<=55){
			System.out.println("you have to increase your weight");	
		 }
		 if(w>=65) {
			System.out.println("you have to decrease your weight");
			}
		 if(h<=5.6){
			 System.out.println("you have to increase your height");
			}
		 if(h>=6) {
			 System.out.println("you have to decrease your height");
		 }
		 if(age<18) {
			 System.out.println("you have to increase your age");
		 }
		 if(age>=51) {
			 System.out.println("you have to decrease your age");
		 }	
		}
	}

}
