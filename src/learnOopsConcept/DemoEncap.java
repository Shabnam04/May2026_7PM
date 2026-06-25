package learnOopsConcept;

public class DemoEncap
{

	private String name = "John";
	private int age = 40;
	
	
	public int getAge() 
	{
		return age;
	}


	public void setAge(int age)
	{
		this.age = age;
	}


	public static void main(String[] args) {
		
		DemoEncap de = new DemoEncap();
		System.out.println(de.name);
		System.out.println(de.age);
		
		System.out.println(de.getAge());
		
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}
	
}
