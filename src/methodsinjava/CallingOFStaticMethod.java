package methodsinjava;

public class CallingOFStaticMethod {
//static to static	
	public static void m1 ()
	{
		
		System.out.println("m1 method");
	}
	public static void m2()
	{
		System.out.println("m2 method");
		m1();
	}
	
	public static void main(String[] args) {
		m2();
		  
//static to non static		
	}
	public void m3 ()
	{
		System.out.println("m3 method");
		m1();
	}
}
