package encaptulation;
public class encaptulation1 {
	public int a=4;	
	private int b=5;
	protected int c=7;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void react() {
		System.out.println("public method");
	}
	public encaptulation1() {
		System.out.println(" public constructor");
	}
	protected void  angular() {
		System.out.println("protected method");
		
	}
	private void html() {
		System.out.println("private method");
	}
	void css() {
		System.out.println("default method");
	}
	public static void main(String[] args) {
		encaptulation1 obj =new encaptulation1();
		obj.react();
		System.out.println(obj.a);
		obj.angular();
		obj.html();
		System.out.println(obj.c);
		obj.css();
		
		
		
		
	}
}

	
		