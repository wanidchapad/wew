package a1;

import java.util.Scanner;

public class a1 {

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("calculation Factorail By share.olanLab.com");
		System.out.print("Pleas input n:" );
		int result=1;
		int n=scan.nextInt();
		for(int i=n;i>=1;i--){
			result*=i;
			
		}
System.out.println("Result="+result);

	}

}
