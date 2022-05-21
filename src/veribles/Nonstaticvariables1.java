package veribles;

public class Nonstaticvariables1 {
	
	int c =20;
	  
	public static void main(String[] args) {
		Nonstaticvariables1 m =new Nonstaticvariables1();
		System.out.println(m.c);//20
		
		m.c=50;
		System.out.println(m.c);//50
		
		m.c= m.c+50;
		System.out.println(m.c);//100
		
		m.c2();//100
	}
		 
		
		
		
	
	
// non static method
	public void c2 ()
	{
		
		System.out.println(c);//20
		
		
		
		
		
	}
}
