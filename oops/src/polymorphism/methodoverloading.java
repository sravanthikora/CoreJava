package polymorphism;
class xyz{
	int max( int a ) {
		System.out.println("first method");
		return a;
	}
	int max( int b ,int x){
		System.out.println("second method");
		int d=b+x;
		return d;
	}
	int max(int c,int y,int z){
		System.out.println("third method");
		int e=c+y+z;
		return e;
	}
}


public class methodoverloading {
	public static void main(String[] args) {
		xyz obj=new xyz();
		obj.max(6);
		obj.max(4, 5);
		obj.max(4,6,7);
		System.out.println(obj.max(5));
		System.out.println(obj.max(4,5));
		System.out.println(obj.max(5,6,7));
		
	
	}
	

}
