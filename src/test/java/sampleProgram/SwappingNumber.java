package sampleProgram;

public class SwappingNumber {
	public static void main(String[]args) {
		int a=9,b=3,c;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("a after swavalue is :"+a );
//		System.out.println("b value is :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a after swavalue is :"+a );

		System.out.println("b value is :"+b);
	}

}
