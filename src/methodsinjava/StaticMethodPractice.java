package methodsinjava;

public class StaticMethodPractice {

	public static void addition ()
	{
		int i = 10 ;
		int j = 20;
		int k = i+j;
		System.out.println(k);
		
	}
	
	public static void main(String[] args) {
		addition();
		Subtraction();
		multiplication();
dividation();
		
		
	}

public static void Subtraction()

{
int l =10 ;
int m =200;
int n = l-m;
System.out.println(n);


}
public static void multiplication ()
{long o = 14541l;
long p = 12345l;
long q = o*p;
System.out.println(q);
	
}

public static void dividation()
{
float r = 54.13f;
float s = 13f;
float t = r/s;
System.out.println(t);
}

}
