package sampleProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,m,n=43,flag=0;
m=n/2;
if(n==0||n==1) {
	System.out.println("not a prime");}
else {
	for(i=2;i<=m;i++) {
		if(n%i==0) {
		System.out.println("not a prime");
		flag=1;
		break;
		}
		
		
	}
	if(flag==0) {
		System.out.println(" a prime");
	}
}


	}

}
