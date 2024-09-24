package com.prog;
import java.util.Scanner;
public class Reverse {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num,dg,rev=0;
	System.out.println("Enter a number");
	num=sc.nextInt();
	while(num!=0)
	{
		dg=num%10;
		rev=rev*10+dg;
		num=num/10;
	}
		System.out.print("reverse of a number"+rev);

	}

}
