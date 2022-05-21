package veribles;

public class LocalVeriablepr {
	
	public static void main(String[] args) {
		int i =10;
		
		System.out.println(i);
		
		if (i<20)
		{
			
			System.out.println(i);
			
			int k=50;
			
			System.out.println(k);
			
		}
		else
		{ 
			
			System.out.println("i is not greter than 20");
			System.out.println(i);
			
		}
		LocalVeriablepr lv = new LocalVeriablepr();
		lv.addition();
		
		
	
	}
	public void addition()
	{
		int i =20;
		int j=30;
		int k= i+j;
		
		System.out.println("the added output is  "+k );
		
		
	}
	

	
		

}
