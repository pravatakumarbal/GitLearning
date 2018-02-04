


class casioc
{
	
	// Constructor overloading
	
	casioc (int i, int j) 
	{
		System.out.println(i+j);
	}
		
	casioc  (int i, int j, int k) 
	{
		System.out.println(i+j+k);
	}
	
	
	casioc (double i, double j, double k) 
	{
		System.out.println(i+j+k);
	}
	
		
	
}


public class ConstructorOverloadDemo {

	public static void main(String[] args) {
		
		casioc ch = new casioc(2,3);
		casioc ch1 = new casioc(2,3,5);
		casioc ch2 = new casioc(2.2,3.3,5.5);
	}

}
