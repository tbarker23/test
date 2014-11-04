package test;
public class TestStuff 
{
	static Integer MAX = Integer.MAX_VALUE;
	static Integer MIN = Integer.MIN_VALUE;
	static String stuff = "stuff";

	public static void main(String [] args)
	{
		System.out.println("hello");
		System.out.println(MAX);
		System.out.println(MIN);
		printStuff(stuff);
	}
	public static void printStuff(String s)
	{
		System.out.println(s);
	}
	public static void printMax()
	{
		System.out.println(MAX);
	}
	public static void printMin()
	{
		System.out.println(MIN);
	}
	public int returnzero()
	{
		return 0;
	}
	public int returnone()
	{
		return 1;
	}
}
