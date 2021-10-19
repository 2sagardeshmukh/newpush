package com.torryharris.JDBCSpring;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
BookDAO1 dao = (BookDAO1)ctx.getBean("bookDAO");
Book book = new Book();
book.setBookId(20);
book.setBookName("Upanishad");
book.setBookPrice(1000);
dao.insert(book);
System.out.println("Book inserted");
Book search = dao.select(23);
System.out.println(search.getBookId()+" "+search.getBookName()+" "+search.getBookPrice());

ArrayList<Book> blist = (ArrayList<Book>) dao.selectAll();
for (Book b:blist)
{
	System.out.println(b);
}
((ClassPathXmlApplicationContext)ctx).close();



//ctx.close();
}
}