package learnJava;



public class FirstProgram
{
	//global variable
	final static int a=10;
	
	float b=10.5f;
	
	char c = 'X';
	
	String d = "Java";
	
	boolean e = false;
	
	public String loc = "India";
	
	 public void printvalues()
	{
		int a=20;
		
		System.out.println(a); //20
		System.out.println(this.a); //10
		 
		// System.out.println(x);
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	 public static void meth2()
	{
		final int x = 100;  //local variable //by adding final  constant
		//x=200;
		System.out.println(x);
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		
		meth2();
		
		//System.out.println("this is main method");
		
		FirstProgram xyz = new FirstProgram();
		
		xyz.meth2();
		
		System.out.println("----------------");
		
		xyz.printvalues();
		
		
		
		//System.out.println(xyz.loc);
		
		//SecondProgram sp = new SecondProgram();
		//sp.main(args);
	
	}
	
	
	
}
