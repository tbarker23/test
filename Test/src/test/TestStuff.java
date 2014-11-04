package test;

public class TestStuff 
{
	/**@vars*/
	Integer MAX = Integer.MAX_VALUE; 
	Integer MIN = Integer.MIN_VALUE;
	static String printStuff = "this is a string";
	
	public static void main(String [] args)
	{
		System.out.println("hello");
		System.out.println(MAX);
		System.out.println(MIN);
		printString(printStuff);
	}
	public static void printString(String s)
	{
		System.out.println(s);
		System.exit(0);
	}
}
