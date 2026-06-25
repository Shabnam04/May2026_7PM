package learnJava;

public class Calculator
{

	
	public Calculator()  //no arguments
	{
		int a=20;
		int b=30;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public Calculator(int a, int b)   //constructor with arguments/parameters
	{
		int c = a+b;
		System.out.println(c);
	
	}
	
	
	public int sum()   //method without arguments/parameters
	{
		int a=20;
		int b=30;
		int c = a+b;
		//System.out.println(c);
		
		float d=100.5f;
		
		String e = "Java";
		
		return b;
	}
	
	
	public int addition(int a, int b)   //method with arguments/parameters
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	//int z=30+40
	
	//z+50
	
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		Calculator cal1 = new Calculator(50, 60);
		
		int x = cal1.sum();
		System.out.println(x); //  30
		
		int z = cal.addition(x,40);
		
		cal1.addition(z, 50);
		cal.main(25);
		
		FirstProgram.meth2();
	}
	
	public static void main(int a)
	{
	
		int b = a*a;
		System.out.println(b);
	}
	
}
