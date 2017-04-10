package a5;

import java.util.Scanner;

public class a5 {
       public static void main(String[]args){
    	   Scanner scan=new Scanner(System.in);
    	   int num1, num2, num3;
    	   System.out.print("Input 1:");
    	   num1 = scan.nextInt();
    	   System.out.print("Input 2:");
    	   num2 = scan.nextInt();
    	   System.out.print("Input 3:");
    	   num3 = scan.nextInt();
    	   
    	   int num1_2 = num1 + num2;
    	   int num1_3 = num1 + num3;
    	   int num2_3 = num2 + num3;
    	   
    	   if (num1_2 >= num1_3 && num1_2 >= num2_3){
    		   System.out.println(num1+"+"+num2+"="+(num1_2)+"is Max.");
    	   }else if (num1_3 >= num1_2 && num1_3 >= num2_3){
    		   System.out.println(num1+"+"+num3+"="+(num1_3)+"is Max." );
    	   }else {
    		   System.out.println(num2+"+"+num3+"="+(num2_3)+"is Max.");
    		   
    	   }
    	   

	}

}
