package a8;

import java.util.Scanner;

public class a8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height,base;
		
		System.out.print("Please input height:");
		height = scan.nextInt();
		
		System.out.print("Please input base:");
		base = scan.nextInt();
		
		System.out.println("Calculating Triangle Area......");
		double area = height * base / 2;
		
		System.out.println("Area : " + area);
		
		}

}
