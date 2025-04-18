package oopsConcept;

public class TC003_Car 
{

	public static void main(String[] args) 
	{
		Car car1 = new Car();
		car1.color = "Brown";
		car1.cost = 2000000;
		car1.model = "Benz A class";
		
		car1.startCar();
		car1.stopCar();
		
		System.out.println("-------------------");
		
		Benz car2 = new Benz();
		car2.color = "White";
		car2.cost = 3000980;
		car2.model = "Benz f class";
		car2.tire = "michelene";
		
		car2.startCar();
		car2.stopCar();
		car2.reverse();

	}

}

class Car
{
	String color;
	int cost;
	String model;
	
	public void startCar()
	{
		System.out.println(model+" is started");
	}
	
	public void stopCar()
	{
		System.out.println(model+" is stopped");
	}
}

class Benz extends Car
{
	
	String tire;
	
	public void reverse()
	{
		System.out.println(model+ " is reversed");
	}
		
	
}