package sampleProgram;
import java.util.*;

public class StringPlaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 StringBuilder s = new StringBuilder("appa"); 
//		 
//		 String q =s.toString();
//		 System.out.println("old STring " +q);
//		 
//		 StringBuilder a = s.reverse();
//		
//		
//		  String w =a.toString();
//		  System.out.println("new String " +w);
//		  if(q.equals(a)) {
//		  System.out.println("String is plaindrome"); 
//		  }
//		 else {
//		 System.out.println("String is not a plaindrome");
//		 }
		 
//		 String original, reverse = ""; // Objects of String class  
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = in.nextLine();   
//	      int length = original.length();   
//	      for ( int i = length - 1; i >= 0; i-- )  
//	         reverse = reverse + original.charAt(i);  
//	      if (original.equals(reverse))  
//	         System.out.println("Entered string/number is a palindrome.");  
//	      else  
//	         System.out.println("Entered string/number isn't a palindrome.");  
//	      
	    String reverse ="";
	    Scanner sc = new Scanner(System.in);
	    String a = sc.nextLine();
    System.out.println("Original string is " +a);
	    int b = a.length();
	    System.out.println(b);
	    
	    for(int i= b-1;i>=0;i--)
	    {
	    	reverse = reverse + a.charAt(i);
	    }
	    	if(reverse.equals(a)) {
	    
	    		System.out.println("String is plaindrome "+reverse);
	    	}else 
	    		System.out.println("String is not a plaindrome "+reverse);

	    	
	    	
	    	
	    
	      
		

	}

}
