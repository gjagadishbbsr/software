package com.prog;

public class Person 
   {
	String name;
	int age;
	Person(String n,int a)
	{
	name=n;
	age=a;
	}
	void print()
	{
	System.out.println("name="+" "+name+" "+"age="+age);
	}

	public static void main(String[] args) 
        {
	Person p1=new Person("Ajay",24);
	Person p2=new Person("vikram",30);
	p1.print();
	p2.print();

	}

   }
