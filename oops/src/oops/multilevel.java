package oops;
class first { int a=10;}
class second extends first{ int b=20;}
class third extends second{int c =30;}


public class multilevel {
	public static void main(String[] args) {
		third obj=new third();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		second ob=new second();
		System.out.println(ob.b);
		System.out.println(ob.a);
		first o=new first();
		System.out.println(o.a);
				
	}
	

}
