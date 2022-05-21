package veribles;

public class Collage {

	String name;
	static String collagename;
	int marksheet;
	int age;
	 static String collagecity;
	 
	 String nativeplace;
	
	public static void main(String[] args) {
		
		Collage s1 =new Collage();
		
		s1.name = "daniel";
		s1.marksheet=50;
		s1.age =18;
		
		s1.nativeplace="mukramabad";
		
		collagecity= "pune";
		collagename="dy patil";
		
		Collage s2 =new Collage();	
		s2.name = "dan";
		s2.marksheet=60;
		s2.age =19;
		
		s2.nativeplace="mukhed";
		
		System.out.println(s1.marksheet
				);
		System.out.println(s2.nativeplace);
		
	}
	
}
