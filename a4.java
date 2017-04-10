package a4;

import java.util.Scanner;

public class a4 {

       public static void main(String[]args){
    	   int point=0;
    	   
    	   Scanner sc =new Scanner(System.in);
    	   System.out.print("Enter you point:");
    	   point=sc.nextInt();
    	   System.out.println("Program is calculating grade");
    	    
    	   switch (point/10){
    	       case 10:
    	       case  9:
    	       case  8:
    	    	   System.out.println("you grade is A");
    	    	   break;
    	       case  7:
    	    	   System.out.println("you grade is B");
    	    	   break;
    	       case  6:
    	    	   System.out.println("you grade is C");
                   break; 
    	       case  5:
    	    	   System.out.println("you grade is D");
    	    	   break;
    	       default:
    	    	   System.out.println("you grade is F");
    	    	   break;
    	    	   
    	   }

	}

}
