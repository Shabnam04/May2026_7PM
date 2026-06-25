package learnOopsConcept;

public class QA4 extends QA2 implements QA3I
{

	public void div(int a, int b)
	{
		
		int c = a/b;
		System.out.println("divison of 2 numbers: " + c);
		
	}
	
	public static void main(String[] args) 
	{
	
		//DemoEncap de = new DemoEncap();
		
		//System.out.println(de.getName());
		//System.out.println(de.getAge());
		
		
		QA4 q4 = new QA4();
		q4.div(40, 20);
		
		//q4.mul(20, 30);
		
		
		q4.sub(20, 30); //qa2
		q4.sum(30, 40);  //qa1
		
		System.out.println(q4.x); //qa1
		
		
		//QA1 q1 = new QA1();
		//q1.sum(30, 60);
		q4.qa3im();
	}

	
	public void qa3im() {
		System.out.println("QA3I method");
		
	}
	
	
}
