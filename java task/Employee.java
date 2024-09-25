package com.prog;

public class Employee {
	String name;
	String title;
	float salary;
	Employee(String n,String t)
	{
		name=n;
		title=t;
	}
    void calculate(float bs,float ta,float da,float hra)
    {
    	salary=bs+ta+da+hra;
    	System.out.println("Name="+" "+name+" "+title);
    	System.out.println("total salary="+salary);
    	
    }
    void update(float newbs)
    {
    	salary=salary+newbs;
    	System.out.println("new salary="+salary);
    	
    }
	public static void main(String[] args) {
		Employee e=new Employee("Arjun","IT");
		e.calculate(15000,1000, 2000,1500);
		e.update(20000);

	}

}
