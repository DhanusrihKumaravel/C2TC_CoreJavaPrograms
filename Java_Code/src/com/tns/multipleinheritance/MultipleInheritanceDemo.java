package com.tns.multipleinheritance;
//Two Interface Class
interface Player{
	void play();
}
interface Runner{
	void run();
}
class Human implements Player,Runner{
	
	@Override
	public void play() {
		System.out.println("He is playing");
	}
	@Override
	public void run() {
		System.out.println("He is swimming");
		
	}
	
}

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		Human h=new Human();
		h.play();
		h.run();
		
		

}
}