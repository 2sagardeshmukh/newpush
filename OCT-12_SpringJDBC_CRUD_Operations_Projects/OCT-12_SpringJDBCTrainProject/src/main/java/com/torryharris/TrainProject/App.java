package com.torryharris.TrainProject;



import java.util.ArrayList;
import java.util.List;

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
TrainDAO1 dao = (TrainDAO1)ctx.getBean("trainDAO");
Train train = new Train();
train.setTrainNo(1012);
train.setTrainName("Bijapur");
train.setSource("solapur");
train.setDest("Bijapur");
train.setTicketPrice(300);
dao.insert(train);
System.out.println("New train details inserted");
Train search = dao.select(1001);
System.out.println(search.getTrainNo()+" "+search.getTrainName()+" "+search.getSource()+" "+search.getDest()+" "+search.getTicketPrice());

ArrayList<Train> tlist = (ArrayList<Train>) dao.selectAll();
for (Train t:tlist)
{
	System.out.println(t);
}
((ClassPathXmlApplicationContext)ctx).close();



// ctx.close();
}
}
