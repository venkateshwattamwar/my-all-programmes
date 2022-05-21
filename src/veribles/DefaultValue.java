package veribles;

public class DefaultValue {
	
	String s;
	int i;
	char c;
	static float f;
	boolean b;
	
	
	
	public static void main(String[] args) {
		DefaultValue dv =new DefaultValue ();
		
		System.out.println(dv.s);//null
		System.out.println(dv.i);//0
		System.out.println(dv.c);//<space>
		System.out.println(f);//0.0
		
		System.out.println(dv.b);//false
		
	}

}
