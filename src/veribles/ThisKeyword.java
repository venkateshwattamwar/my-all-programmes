package veribles;

public class ThisKeyword {
	static int i=50;
	
	int k=60;
	
	public static void main(String[] args) {
		int i = 10;
		String l ="abc";
		System.out.println(l);
		System.out.println(i);//local10
		
		System.out.println(ThisKeyword.i);//global 50
		
		m2();
		ThisKeyword a =new ThisKeyword();//method
		a.m1();
		
		
	}
	public void m1()

	{
		int k=80;
		System.out.println(k);//80
		
		System.out.println(this.k);//60
		
	}
	
	public static void m2()
	{
		int k =80;
		System.out.println(k);//80
		ThisKeyword tk = new ThisKeyword();
		System.out.println(tk.k);//60
		
	}

}
