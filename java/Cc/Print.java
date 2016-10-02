package Cc;

import java.io.*;

public class Print {
	public final static void print(Object obj) {
		System.out.println(obj);
	}
	public final static void print() {
		System.out.println();
	}
	public final static void printnb(Object obj) {
		System.out.print(obj);
	}
	public final static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
