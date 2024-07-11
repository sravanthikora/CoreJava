package oops;
class sarvani{
	int marks=95;
	int age=21;
	float weight=40.5f;
	void sar() {
		System.out.println("bestie");
	}
	sarvani(){
		System.out.println("always");
	}
	float sarv(){
		float w=40.5f;
		float h=41.5f;
		float result=w+h;
		System.out.println("sarv method");
		return result;
		
		
	}
}
class sravanthi{
	public int marks=90;
	public int age =20;
	void srav() {
		System.out.println("srav method");
		
	}
	sravanthi(int a ,int b){
		System.out.println("constructor of sravanthi class");
		System.out.println(a+b);
		System.out.println(marks-age);
	}
	int sra(int x,int y){
		System.out.println(x+y);
		return x+y;
	}
	
		
	
}

public class practies {
	public static void main(String[] args) {
		sarvani obj=new sarvani();
		obj.sarv();
		obj.sar();
		System.out.println(obj.sarv());
		sravanthi ob=new sravanthi(4,5);
		ob.srav();
		ob.sra(6, 7);
		System.out.println(ob.age);
		System.out.println(ob.marks);
		
		
		
		
	}

}
