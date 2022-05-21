package veribles;

public class StaticVeriables {
	static int a=10;
	String b= "abc";
	
	
 public static void main(String[] args) {
	 System.out.println(a);//10
	 
	 a=a+2;
	 System.out.println(a);//12
	 a=50;
	 a=70;
	 System.out.println(a);//70
	 StaticVeriables t = new StaticVeriables();
	 t.p1();
	 
	 
	
}
 //non static
 public void p1 ()
 {
	 
	 System.out.println(a);
	 
	 
 }
 
}

