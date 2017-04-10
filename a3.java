package a3;

import java.util.Scanner;

public class a3 {

     public static void main(String[]args){
    	 Scanner scan = new Scanner (System.in);
    	 
    	 System.out.print("please input:");
    	 int num=scan.nextInt();
    	 
    	 for(int i=1;i<=100;i++){
    		 System.out.println(i+"*"+num+"="+(i*num));
    	 }
	}

}
