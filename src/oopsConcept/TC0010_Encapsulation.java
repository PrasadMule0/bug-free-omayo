package oopsConcept;

public class TC0010_Encapsulation {

	public static void main(String[] args) 
	{
		DogX d = new DogX();
		d.setBreed("Doberman");
		d.setName("Dobb");
		d.setColor("White");
		
		d.getBreed();
		d.getName();
		d.getColor();

	}

}

class DogX
{
	private String breed;
	private String name;
	private String color;
	
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	
	public void getBreed()
	{
		System.out.println("Breed is: "+breed);
	}
	
	public void getName()
	{
		System.out.println("The name is: "+name);
	}
	
	public void getColor()
	{
		System.out.println("The color is: "+color);
	}
}