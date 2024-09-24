package com.prog;

public class Square 
    {
	void solve(int x)
	{
	  int sqr=x*x;
	  System.out.println("square of a number"+sqr);
	}

	public static void main(String[] args)
        {
	Square ob=new Square();
        ob.solve(10);
	}

   }
