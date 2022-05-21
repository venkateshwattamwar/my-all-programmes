package veribles;

public class StaticVeriablePractice {
	
	static int a= 10;
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		a=a+2;
		
		System.out.println(a);//calling of static variable in the same class
		
		System.out.println(Test.b);//calling of static variable from other class
		
		a=60;
		
		System.out.println(a);//60
		
		StaticVeriablePractice sv = new StaticVeriablePractice();
		sv.m1();
		
				
		
	}
	public void m1()
	{
		System.out.println(a);//calling of static variablr in same class
		
		System.out.println(Test.b);// calling of static variabe of other class
		
	}
	

}
