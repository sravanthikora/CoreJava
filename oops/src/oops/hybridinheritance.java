package oops;
class X{
	int x=70;
	}
class Y extends X{ 
	float y=6.9f;
	Y(){
		System.out.println("y class constructor");
	}
	}
class Z extends Y{
	String s="happy";
	Z(){
		System.out.println("z class constructor");
	}
	}
class W extends X{ 
	double d=67.9000;
	}


public class hybridinheritance {
	public static void main(String[] args) {
		Z obj=new Z();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.s);
		W ob=new W();
		System.out.println(ob.x);
		System.out.println(ob.d);
		Y o=new Y();
		System.out.println(o.x);
		System.out.println(o.y);
		
		
	}
	
}
