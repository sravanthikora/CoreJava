package arrays;
public class onedimentional {
	public static void main(String[] args) {
		int i[]= {3,5,6,8};
		int j[]=new int[4];
		j[0]=5;
		j[1]=3;
		j[2]=8;
		j[3]=9;
		System.out.println( "3rd index is;" + j[3]);
		System.out.println("using for loop");
	for(int k=0;k<i.length;k++){
			System.out.println(i[k]);
		
		}
	System.out.println("using while loop");

		int x=0;
		while(x<i.length) {
			System.out.println(i[x]);
			x++;
		}
		System.out.println("using dowhile loop");
		int y=0;
		do{
			System.out.println(i[y]);
			y++;
		}
		while(y<i.length);
		
	}

}
