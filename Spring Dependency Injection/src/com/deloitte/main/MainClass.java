package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojo.HelloIndia;
import com.deloitte.pojo.HelloWorld;
import com.deloitte.pojo.Point;
import com.deloitte.pojo.TextEditor;


public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Point point1 = (Point)context.getBean("pointBean");
		System.out.println(point1);
		
		Point point2 = (Point)context.getBean("pointBean");
		System.out.println(point2);
		
		point2.setX(5);
		point2.setY(15);
		System.out.println("Point 1 now is "+point1);
		System.out.println("Point 2 now is "+point2);
		
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	    objA.getMessage1();
	    objA.getMessage2();

	    HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
	    objB.getMessage1();
	    objB.getMessage2();
	    objB.getMessage3();
		
	    
	    TextEditor te1 = (TextEditor)context.getBean("textEditorCDI");
	    te1.spellCheck();
	    
	    TextEditor te2 = (TextEditor)context.getBean("textEditorSDI");
	    te2.spellCheck();
	    
	    TextEditor te3 = (TextEditor)context.getBean("textEditorAWbN");
	    te3.spellCheck();
	    
	    TextEditor te4 = (TextEditor)context.getBean("textEditorAWbT");
	    te4.spellCheck();
	    
	    TextEditor te5 = (TextEditor)context.getBean("textEditorAWbC");
	    te5.spellCheck();
	    te5.getName();
	    
	    
	   
	}

}
