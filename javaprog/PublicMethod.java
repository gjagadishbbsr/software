package com.prog;

public class PublicMethod
 {
  int a,b,c;
  public void get()
   {
     a=90;
     b=80;
     c=a+b;
     System.out.println("sum is"+c);   
	   
   }
  public static void main(String[] args) 
        {
         PublicMethod m=new PublicMethod();
	  m.get();

	}
 }
