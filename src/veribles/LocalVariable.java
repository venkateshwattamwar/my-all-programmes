package veribles;

public class LocalVariable {
	
	static int a =20;
	 int i =30;
	
	
	
	public static void m()
	{
		
		int b = 70;
		System.out.println(b);
	}
	public static void main(String[] args) {
		int i =10;
		System.out.println(i);//10
		
		m();//70
		
	            m2();
		
		
	}
static	public void m2()
	{LocalVariable c=new LocalVariable();
		int i =20;
		System.out.println(i);
		System.out.println(c.i);
		
	}
}
