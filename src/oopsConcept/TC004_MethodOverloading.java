package oopsConcept;

public class TC004_MethodOverloading {

	public static void main(String[] args) 
	{
		sub(10, 5, 2);
		
	}
	
	public static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public static void sub(double a, int b)
	{
		System.out.println(a-b);
	}
	
	public static void sub(int a, int b, int c)
	{
		System.out.println(a-b-c);
	}

}
