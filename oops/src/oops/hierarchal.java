package oops;
class animal{
	void sleep() {
		System.out.println("animal can sleep");
	}
}
class dog extends animal{
	void bow() {
		System.out.println("dog says bow");
	}
}
class cat extends animal{
	void meow() {
		System.out.println("cat says meow");
		super.sleep();
	}
}


public class hierarchal {
	public static void main(String[] args) {
		dog obj=new dog();
		obj.bow();
		obj.sleep();
		cat ob=new cat();
		ob.meow();
	}

}
