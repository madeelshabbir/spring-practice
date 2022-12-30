package com.springcore.references;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean, DisposableBean {
  private int x;
  private B ob;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public B getOb() {
    return ob;
  }

  public void setOb(B ob) {
    this.ob = ob;
  }

  A() {}

  A(int x, B ob) {
    this.x = x;
    this.ob = ob;
  }

  public void init() {
    System.out.println("init() executed");
  }

  public void destroy() {
    System.out.println("destroy() executed");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("afterPropertiesSet() executed");
  }

  @PostConstruct
  public void start() {
    System.out.println("start() executed");
  }

  @PreDestroy
  public void end() {
    System.out.println("end() executed");
  }
}
