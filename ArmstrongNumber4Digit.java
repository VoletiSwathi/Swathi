package Prime;

import java.util.Scanner;

public class ArmstrongNumber4Digit {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("enter a number");
       int n=s.nextInt();
       int res=0;
       int org=n;
       while(n!=0) {
    	   int dig=n%10;
    	   res+=Math.pow(dig, 3);
    	   n/=10;
    	   
       }
    	if(res==org) {
    		System.out.println("arm");
    	}else {
    		System.out.println("Not Arm");
    	}
    }}