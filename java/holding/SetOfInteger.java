package holding;

import java.util.*;

public class SetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Set<String> intset = new HashSet<String>();
		for(int i = 0; i < 10000; i++) {
			intset.add(Integer.toString(rand.nextInt(30)));
		}
		System.out.println(intset);
	}
}