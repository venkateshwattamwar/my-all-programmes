package veribles;

public class NonStaticMethodPractice {
	
	int i = 50;
	
	String s= "abc";
	
static	 int k= 30;
	
	
	
	public static void main(String[] args) {
		
	 NonStaticMethodPractice nsv = new NonStaticMethodPractice();
	 
	 System.out.println(nsv.i);//50
	 
	 nsv.i=10;
	 
	 NonStaticMethodPractice nsv1 =new NonStaticMethodPractice();
	 
	 nsv1.i=20;
	 
	 System.out.println(nsv.i);//10
	 
	 System.out.println(nsv1.i);//20
	 
	 nsv.s =nsv .s+ "def";
	 
	 System.out.println(nsv.s);//abcdef
	 
	 System.out.println(k);//30
	 
	 
	 System.out.println(k);//30
	 
	 System.out.println(k);//30
	 k =40;
	 System.out.println(k);//40
			 
	 k=80;
	 
	 System.out.println(k);//80
	 
	 System.out.println(k);//80
	 
	 
	 
	 
	 
	 
		
		
	}
	
	

}
