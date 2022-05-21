package methodsinjava;

public class CtegoriesOfMethods {
	
	//method with no return and no argument
	
	public static void m1()
	{
		System.out.println("method with no return and no argument");
		
		
	}
	public void m2()
	{
		System.out.println("method with no return and no argument");
		
	}

	
	//b. method with no return and with argument
	
	public static void m3(int a,int b)
	{
		System.out.println(a);
		
		System.out.println(b);
		
		
	}

	public static void add (int i, int j)
	{
		int k =i+j;
		
		System.out.println(k);
		System.out.println("now executing m3 method");
		//m3(50,80);
		
		
	}
	//c. method with return type and no argument
	public static int m4()
	{
		System.out.println("method with return type and no argument");
		
		return 100;
		
	}
	public String m5 ()
	{
		String s1 ="corporate";
				
				System.out.println(s1);
				
				return "velicity";
		
	}	
	
	public static void main(String[] args) {
		//method with no return no atgument
		m1();
		CtegoriesOfMethods p=new CtegoriesOfMethods();
		p.m2();//a.
		//b. method with no return and with argument
		add(10,20);
		
		m3(50,10);
		
		m3(80,20);
		add(10,10);
		// calling of method with return and without argument
		System.out.println("**********");
		
		int k= m4();
		System.out.println(k);
		
		int l = k+2;
		 
		System.out.println(l);
		
		CtegoriesOfMethods z = new CtegoriesOfMethods();
		
		String h = z.m5();
		
		System.out.println(h);
		
		//method with return and with argument

		System.out.println(m6("pune",50));
		
		int w = m6 ("bengluru",100);
		
		System.out.println(w);
			
		
	}
     //method with return and with argument
	public static int m6 (String s1, int i)
	{
     
	s1= s1+"city";
	
	System.out.println("value of s1 is "+s1);
	
	i= i+2;
	
	System.out.println("value of i is "+i);
	
	return i;
	

}
	
}