package linecomparisonproblem;

import java.util.Scanner;

public class CalculateLength {
	
	public static void main(String[] args) {
		   
		    Scanner sc = new Scanner(System.in);
	        System.out.println("enter first co-ordinates vale x1 and y1 is ");
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        System.out.println("enter first co-ordinates vale x2 and y2 is");
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        double length = Math.sqrt((Math.pow((x2-x1),2)) +(Math.pow((y2-y1),2)));
		    System.out.println("Length of line :"+length);
	
	}
}
