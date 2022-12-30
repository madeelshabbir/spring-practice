package com.springcore.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/references/ref-config.xml");
    A a = (A) context.getBean("aref");
    A a1 = (A) context.getBean("aref1");
    System.out.println(a.getX());
    System.out.println(a.getOb().getY());
    System.out.println(a1.getX());
    System.out.println(a1.getOb().getY());
  }
}
