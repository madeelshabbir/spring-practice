package com.springcore.references;

public class A {
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
}
