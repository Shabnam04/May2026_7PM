package learnOopsConcept;

public abstract class DemoAbsClass
{

	int a = 200;
	
	public void meth1()
	{
		a=300;
		System.out.println("this is concrete method");
	}
	
	public abstract void meth2();
	
	
	public static void main(String[] args) {
		
		//DemoAbsClass ac = new DemoAbsClass();
		
		
	}
	
}
