package encaptulation2;

import encaptulation.encaptulation1;

public class encaptulation2 {
	public static void main(String[] args) {
		encaptulation1 obj =new encaptulation1();
		obj.react();
		System.out.println(obj.a);
		System.out.println(obj.getB());
	
	}

}
