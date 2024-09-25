package com.prog;

public class Rectangle {
   float width,height;
   public void input(float x,float y)
     {
       width=x;
       height=y;
     }
   public void perimeter()
     {
	float per;
	per=2*(width+height);
	System.out.println("perimeter="+per);
     }
   public void area()
     {
        float ar;
	ar=width*height;
	System.out.println("area="+ar);
     }
   public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.input(200,100);
	r.perimeter();
	r.area();

	}

}
