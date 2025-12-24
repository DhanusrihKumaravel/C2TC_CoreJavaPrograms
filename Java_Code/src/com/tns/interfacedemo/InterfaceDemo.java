package com.tns.interfacedemo;
  interface Example{
	  void basic();
  }
 public class InterfaceDemo implements Example{
	 public void basic() {
		 System.out.println("basic of example");
	 }
  public static void main(String args[]) {
	  InterfaceDemo id = new InterfaceDemo();
	  id.basic();
  }
}
