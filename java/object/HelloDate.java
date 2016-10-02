package object;

//:object/test01.java
import java.util.*;

/** The first Java program with notes.
 * Display something.
 * @author Dewen_Chao
 * @author vaal.just#gmail.com
 * @version 1.0
 */
/** Main class. */
public class HelloDate {
	/** The variable is null. */
	int num = 0;
	/** Entry point to class & application.
	 * @param args array of string arguments
	 * @throws exceptions No exceptions thrown
	 * */
	public static void main(String[] args)
	{
		//System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		//System.out.println(
				//System.getProperty("java.library.path"));
		System.out.println(new Date());
	} /* Output: (55% match)
	11VS11
	Wed Oct 29 21:20:48 CST 2014
	*///:~
}