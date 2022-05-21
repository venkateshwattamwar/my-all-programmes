package methodsinjava;

public class LandFarmingCalculation {
	
	public static int i (int l,int b)
	{
		int k= l*b;
		
		System.out.println(k);
		
		return k;
		//
		
	}
	public static void main(String[] args) {
		
	int a= i(10,20);
	int b= i(20,30);
	int c = i(30,40);
	int d= i(40,30);

	System.out.println(a+b+c+d);
	
		
	}

}
