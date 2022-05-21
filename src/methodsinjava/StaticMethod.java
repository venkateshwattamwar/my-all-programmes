package methodsinjava;

 class StaticMethod {

	
	 static void methodOne ()
	{
		
		System.out.println("executing method one");
		
	}
	
		 static void methodTwo()
		{
			
			System.out.println("executing method two");

			System.out.println("static method");
			
			
		}
		public static void main(String[] args) {
			
			
			methodOne ();
			methodTwo();
			StaticMethod1.methodThree();
			
			StaticMethod. methodOne();
			NonStaticMethod p = new NonStaticMethod	();
			p.m1();
			
		}
		class StaticMethod1{
			
			static void methodThree()
			
			{
				System.out.println("venkatesh");
			}
			
		}

}
