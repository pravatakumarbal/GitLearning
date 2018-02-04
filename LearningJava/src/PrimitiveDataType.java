
public class PrimitiveDataType {

	static int i=999;   // 4 bytes
	static byte by= 100; // 1 byte
	static float j=3.41f;
	static char c= 'C';
	static String st="String";
	static boolean b=true;
	static long  l =100000L; // 8 bytes
	static double d=7.8;
	static short s=10000; // 2 bytes
	
	// Implicit and Explicit conversion
	
	//	Explicit
	static int i1=s;
	// Implicit
	static short s1=(short)i;
	
	// NAming Convention  
	
	//className and interface --- > Camelacse -- MyFirstProgram, PrimitiveDataType
	// Methods small--- > add, write, addPrincipal
	// Variables small, if more than one ord - small the first letter caps -- > stockPrice
	//Constants ate capital letter ----> MAX_PRICe
	
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(i);
		System.out.println(by);
		System.out.println(j);
		System.out.println(c);
		System.out.println(st);
		System.out.println(b);
		System.out.println(l);
		System.out.println(d);
		System.out.println(s);
		System.out.println(i1);
		System.out.println(s1);
	}

}
	
	

