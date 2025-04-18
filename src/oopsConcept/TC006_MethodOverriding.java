package oopsConcept;

public class TC006_MethodOverriding 
{

	public static void main(String[] args) 
	{
		classA obj = new classA();
		obj.multiply(3, 3);
		
		classB obj2 = new classB();
		obj.multiply(3, 2);

	}

}

class classA
{
	public void multiply(int a, int b)
	{
		System.out.println("Multiplication from class A is: "+(a*b));
	}
}

class classB extends classA
{
	public void multiply(int a, int b)
	{
		System.out.println("Multiplication from class A is: "+(a*b));
	}
}


