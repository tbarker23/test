package test;

public class TestStuff 
{
	static String printStuff = "this is a string";

	public static void main(String [] args)
	{
		System.out.println("hello");
		printString(printStuff);
	}
	public static void printString(String s)
	{
		System.out.println(s);
		System.exit(0);
	}
}
