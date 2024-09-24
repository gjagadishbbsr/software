package com.prog;
import java.util.Scanner;
public class Fibo 
{
   public static void main(String[] args) 
    {
	int num,f0,f1,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	num=sc.nextInt();
	f0=0;
	f1=1;
	System.out.println(f0);
	while(sum<=num)
	{
	f0=f1;
	f1=sum;
	sum=f0+f1;
	System.out.println(sum);
		}
	}
}

