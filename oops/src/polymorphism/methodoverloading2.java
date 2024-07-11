package polymorphism;
class abc{
	int min(int a) {
		System.out.println("print a value");
		return a;
	}
		
	
	float min(float b) {
		System.out.println("print ba value");
		return b;
		
	}
	double min(double c) {
		System.out.println("print c value");
		return c;
	}
		
}

public class methodoverloading2 {
	public static void main(String[] args) {
		abc obj=new abc();
		obj.min(5);
		obj.min(56.7f);
		obj.min(56.788);
		System.out.println(obj.min(6));
		System.out.println(obj.min(45.6f));
		System.out.println(obj.min(67.889));
	}

}
