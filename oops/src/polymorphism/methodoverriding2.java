package polymorphism;
class shivani{
	void ben() {
		System.out.println("ben method1");
	}
}
class sarvani extends shivani{
	void ben() {
		System.out.println("ben method 2");
	}
}
class sravanthi extends shivani{
	void ben() {
		System.out.println("ben method 3");
	}
}
class nagu extends shivani{
	void ben() {
		System.out.println("ben method 4");
	}
}

public class methodoverriding2 {
	public static void main(String[] args) {
		shivani object =new shivani();
		object.ben();
		shivani obj=new sarvani();
		obj.ben();
		shivani ob=new sravanthi();
		ob.ben();
		shivani o=new nagu();
		o.ben();
		shivani obje;
		obje=new shivani();
		obje.ben();
		obje=new sarvani();
		obje.ben();
		obje=new sravanthi();
		obje.ben();
		obje=new nagu();
		obje.ben();
				
		
	}

}
