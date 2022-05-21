package methodsinjava;

public class NOnStaticFunction {
// non static to static
	public void s1()
	{
		System.out.println("this is s1 method");
		
	}
	public static void s2 ()
	{
		System.out.println("this is s2 method");
		NOnStaticFunction n = new NOnStaticFunction();
		n.s1();
	}

	public void s3()
	{
		System.out.println("this is s3 method");
		
	}
	public static void main(String[] args) {
		s2();
		CallingOFStaticMethod v = new CallingOFStaticMethod();
		v.m3();
		CallingOFStaticMethod.m2();
		
		
	}
	//non static to non static
	public void s4 ()
	{
		System.out.println("this is s4 method");
		
	}
	public void s5 ()
	{
		System.out.println("this is s5 method");
		s4();
		s2();
		NOnStaticFunction t=new NOnStaticFunction();
		t.s4();
		
	}
	
	
}
