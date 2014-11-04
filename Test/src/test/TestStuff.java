package test;

public class TestStuff 
{
	static String stuff = "stuff";
	public static void main(String [] args)
	{
		System.out.println("hello");
		printString(stuff);
	}
	public static void printString(String s)
	{
		System.out.println(s);
		System.exit(0);
	}

}
