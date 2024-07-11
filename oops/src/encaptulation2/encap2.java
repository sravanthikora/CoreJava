package encaptulation2;

import encaptulation.encaptulation1;


public class encap2 extends encaptulation1 {
	void ang() {
		super.angular();
	}
	public static void main(String[] args) {
		encap2 obj=new encap2();
		obj.react();
		System.out.println(obj.a);
		System.out.println(obj.getB());
		obj.ang();
		
		
	}

}
