package learnOopsConcept;

public class QA2 extends QA1
{

	
	final int x = 100;
	
	public void printvaluesX()
	{
		//x = 400;
		
		
		final int x = 200;
		//x=300;
		System.out.println(x); //200
		
		System.out.println(this.x); //100
		
		System.out.println(super.x);
		
		super.sum(20, 30);
	}
	
	
	public void sum(int a, int b)
	{
		
		int c = a*a+b*b;
		System.out.println("sum of 2 numbers: " + c);
		
	}
	
	
	public void sub(int a, int b)
	{
		
		int c = a-b;
		System.out.println("subs between 2 numbers: " + c);
		
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sub(20, 30);
		q2.sum(30, 40);  //QA1
		
		System.out.println(q2.x);
		
		
		//QA1 q1 = new QA1();
		//q1.sum(30, 60);
		
		System.out.println("----------");
		
		q2.printvaluesX();
		
	}


	
	public void qa1im() {
		System.out.println("QA1I method");
		
	}
	
	
}
