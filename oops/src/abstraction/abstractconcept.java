package abstraction;
 abstract class A{
	 int a=30;
	public int getA() {
		return a;
	}
	static int b=40;
	final float c=23.5f;
    abstract protected void fun();
	abstract void ben();
	static int add() {
		int x=10;
		int y=20;
		int sum=x+y;
		return sum;
	}
}
 class B extends A{
	protected void fun() {
		 System.out.println("fun method of abstractio");
	 }
	 void ben() {
		 System.out.println("ben method of abstraction");
	 }
	 B(){
		 System.out.println("B class constructor");
	 }
	 public void setA(int a) {
			this.a = a;
	}
 }

public class abstractconcept {
	public static void main(String[] args) {
		B obj=new B();
		obj.ben();
		obj.fun();
		System.out.println(obj.a);
		System.out.println(A.b);
	    System.out.println(A.add());
	    System.out.println(obj.c);
	}

}
