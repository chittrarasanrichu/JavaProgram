package sampleProgram;

public class PlaindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int  sum=0,temp,r;
//		int n= 40005;
//		temp=n;
//		
//		while(n>0) {
//		r=n%10;//4,5,0
//		sum = (sum*10)+r;//sum=4,45,454
//		n=n/10;//45,4,0
//		}
//		if(temp==sum) {
//			System.out.println("palindrome");
//		}else
//		{
//			System.out.println("NOT a palindrome");
//		}
		
		int a= 1091,sum=0,i,r,temp;
		
		temp=a;
		
		while(a>0) {
			r=a%10;
			sum= (sum*10)+r;
			a=a/10;
			
		}
		if(temp==sum){
			
			System.out.println("number " + temp +" is a plaindrome");
		}else
			System.out.println("number " + temp +" is not a plaindrome");
		
			}

}
