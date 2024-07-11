package polymorphism;
class shapes{
	void draw() {
		System.out.println("shapes");
		
	}
}

class pentagon extends shapes{
		void draw() {
			System.out.println("pentagon");
			super.draw();
			
		}
}
class hexagon extends pentagon{
	void draw() {
		System.out.println("hexagon");
		super.draw();
		
	}
}
class octagon extends hexagon{
	void draw() {
		System.out.println("ocatagon");
		super.draw();
		
	}
}
		

public class methodoverriding {
	public static void main(String[] args) {
		octagon obj=new octagon();
		obj.draw();
		
		
	}

}
