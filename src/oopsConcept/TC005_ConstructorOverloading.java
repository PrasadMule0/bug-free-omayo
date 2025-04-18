package oopsConcept;

public class TC005_ConstructorOverloading {

	public static void main(String[] args) 
	{
		new TC005_ConstructorOverloading(10, 5);

	}

	public TC005_ConstructorOverloading(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public TC005_ConstructorOverloading(double a, int b)
	{
		System.out.println(a-b);
	}
	
	public TC005_ConstructorOverloading(int a, int b, int c)
	{
		System.out.println(a-b-c);
	}
}
