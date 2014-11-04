package test;

public class TestStuff 
{
	static String stuff = "stuff";
	Integer MAX = Integer.MAX_VALUE;
	Integer MIN = Integer.MIN_VALUE;
	public static void main(String [] args)
	{
		System.out.println("hello");

		printString(stuff);
		System.out.println(MAX);
		System.out.println(MIN);
	}
	public static void printString(String s)
	{
		System.out.println(s);
		System.exit(0);
	}
		

	public static void printMax()
	{
		System.out.println(MAX);
	}
	public static void printMin()
	{
		System.out.println(MIN);
	}

}
