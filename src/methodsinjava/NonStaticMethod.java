package methodsinjava;

public class NonStaticMethod {

	public void m1()
	{
		System.out.println("non static m1 method");
		
	}
	public void m2()
	{
		System.out.println("non static m2 method");
		
	}
	public static void main(String[] args) {
		// object sytex :
		//classname variable name =new classname();
		
		NonStaticMethod p = new NonStaticMethod	();
				
				p.m1();
		        p.m2();
		        
				
	}
}
