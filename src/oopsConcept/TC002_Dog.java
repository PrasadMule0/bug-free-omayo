package oopsConcept;

public class TC002_Dog {

	public static void main(String[] args) 
	{
		TC001_Dog dog1 = new TC001_Dog();
		dog1.breed = "German shepard";
		dog1.color = "Brown";
		dog1.name = "Ceaser";
		
		dog1.barking();
		dog1.eating();
		dog1.sleeping();
		System.out.println("-------------------------");
		
		TC001_Dog dog2 = new TC001_Dog();
		dog2.breed = "Pug";
		dog2.color = "White";
		dog2.name = "aluu";
		
		dog2.barking();
		dog2.eating();
		dog2.sleeping();

	}

}
