package com.prog;

public class SumDigit {

	public static void main(String[] args) {
	    int num=786,dg,sum=0;
	    while(num!=0)
		{
		 dg=num%10;
		 sum=sum+dg;
		 num=num/10;
		}
		System.out.println("sum of digits"+sum);

	   }

     }
