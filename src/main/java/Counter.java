package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		count = 0;
		count = 1;
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
