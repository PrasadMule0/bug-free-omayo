package oopsConcept;

public class TC008_AbstarctClass {

	public static void main(String[] args) 
	{
		ClassY y = new ClassY();
		y.methodA();
	}

}

abstract class ClassX
{
	public abstract void methodA();
}

class ClassY extends ClassX
{

	public void methodA()
	{
		System.out.println("From method A");
		
	}
	
}