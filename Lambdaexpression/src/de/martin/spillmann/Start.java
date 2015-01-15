package de.martin.spillmann;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Start {
	
	public static void main (String [] args) {
		Start start = new Start();
		
		
		start.done();
	}

	
	private void done() {

//		int factor = 1000;
//		IntUnaryOperator times1000 = (int x) -> {return x * factor;};
//		Arrays.stream(new int[]{1,2,3,4,5}).map(times1000).forEach(y->System.out.println(y+1));

		int factor = 1000;
		IntUnaryOperator times1000 = (int x) -> {return x * factor;};
		Arrays.stream(new int[]{1,2,3,4,5}).map(times1000).forEach(System.out::println);
	}
}
