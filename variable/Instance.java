package com.jaga;

public class Instance {
	int a=10,b=20;
	public static void main(String args[])
	{
		Instance obj=new Instance();
		int c=obj.a*obj.b;
		System.out.println("multiplication of two no's:"+c);
	}

}
