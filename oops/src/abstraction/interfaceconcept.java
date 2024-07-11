package abstraction;
interface shape{
	int a=20;
	static float b=40.8f;
	
	abstract void circle();
	static void rectangle() {
		System.out.println("area of the rectangle is=length*height" );
	}
	default void trianglr() {
		System.out.println("area of the triangle = (1/2)*base*height");
	}
}
interface shape1{
	static int c=45;
	static int square() {
		int d=5;
		int area=d*d;
		System.out.println("area of of the square is");
		return area;
		
		
	}
	default void cube() {
		System.out.println("volume of cube is length*length*length");
	}
	
	
}
class shape2 implements shape,shape1{
	int h=80;
	public void circle() {
		System.out.println("area of the circle = pi*r*r");
		
	}
}

public class interfaceconcept {
	public static void main(String[] args) {
		shape2 obj=new shape2();
		obj.circle();
		obj.trianglr();
		shape.rectangle();
		System.out.println(obj.h);
		System.out.println(shape.a);
		System.out.println(shape.b);
		System.out.println(shape1.square());
		obj.cube();
		System.out.println(shape1.c);
		
	}
	
	

}
