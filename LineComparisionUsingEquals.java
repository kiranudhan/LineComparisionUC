package linecomparisonproblem;

import java.util.Scanner;

public class LineComparisionUsingEquals {
    
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        System.out.println("enter first co-ordinates vale x1 and y1 is ");
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        System.out.println("enter first co-ordinates vale x2 and y2 is");
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        double length1 = Math.sqrt((Math.pow((x2-x1),2)) +(Math.pow((y2-y1),2)));
	        String len1=Double.toString(length1);
	        System.out.println("enter first co-ordinates vale x3 and y3 is");
	        int x3 = sc.nextInt();
	        int y3 = sc.nextInt();
	        System.out.println("enter first co-ordinates vale x4 and y4 is");
	        int x4 = sc.nextInt();
	        int y4 = sc.nextInt();
	        double length2 = Math.sqrt((Math.pow((x4-x3),2)) + (Math.pow((y4-y3),2)));
	        String len2=Double.toString(length2);
	        System.out.println("length of the first line " +len1);
	       System.out.println("length of the first line " +len2);
	        System.out.println();

	        if(len1.equals(len2))
	            System.out.println("Both Lines are EQUAL ");
	        else
	            System.out.println("Both Lines are not EQUAL");

	    }
	
    }


