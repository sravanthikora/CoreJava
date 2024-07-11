package encaptulation;

public class encap1 {
	public static void main(String[] args) {
		encaptulation1 obj =new encaptulation1();
		obj.react();
		System.out.println(obj.a);
		obj.angular();
		System.out.println(obj.c);
		System.out.println(obj.getB());
		obj.setB(8);
		System.out.println(obj.getB());
		obj.css();
		
		
	}

}
