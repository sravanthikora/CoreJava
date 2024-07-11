package oops;
class A{
	int a=30;
	void gill() {
		System.out.println("parent class");
	}
	A(){
		System.out.println(" parent class constructor");
	}
}
	class B extends A{
		int b = 20;
		int child() {
			System.out.println("child class");
			System.out.println(a+b);
			gill();
			super.gill();
			return a+b;
		}
		B(){
			System.out.println("child class constructor");
		}
	}
	


public class inheritance {
	public static void main(String[] args) {
		B obj=new B();
		obj.child();
		obj.gill();
		System.out.println(obj.a);
		
	}
	

}
