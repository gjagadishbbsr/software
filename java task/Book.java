package com.prog;

public class Book {
   String title,author;
   float price;
   Book()
     {
     title="c";
     author="kanitkar";
     price=348;
      }
   Book(String t,String a)
      {
      title=t;
      author=a;
	}
   Book(String t,String a,float p)
   {
    title=t;
    author=a;
    price=p;   
   }
   public void display()
   {
    System.out.println(title+" "+author+" "+price);   
    }

    public static void main(String[] args) {
    Book b1=new Book();
    Book b2=new Book("C++","balaguruswamy");
    Book b3=new Book("java","rashmi das",500);
    b1.display();
    b2.display();
    b3.display();
	}
}


