package learnOopsConcept;

public class T1 extends DemoAbsClass
{

	
	public void meth2() {


		System.out.println("this is T1 credential");
		
	}

	public static void main(String[] args) {
		
		
		T1 t1 = new T1();
		t1.meth1();
		t1.meth2();
		
	}
	
}
