package learnOopsConcept;

public class QA1 
{

	int x = 500;
	
	public QA1()
	{
		
		System.out.println("this is QA1 constructor");
	}
	
	public void sum(int a, int b)
	{
		
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		
	}
	
	
	
	public void sum(int a, int b, int c)
	{
		
		int d = a+b+c;
		System.out.println("sum of 3 numbers: " + d);
		
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		
	}
	
	public static void main(String[] args) 
	{
	
		QA1 q1 = new QA1();
		
		q1.sum(30, 60);
		
		
		q1.sum(20, 20.5f);
		q1.sum(20, 30, 40);
		
	}
	
	
}
