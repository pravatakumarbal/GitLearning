class casio{
	
	
		public void add (int i, int j) 
	{
		System.out.println(i+j);
	}
	public void add (int i, int j, int k) 
	{
		System.out.println(i+j+k);
	}
	public void add (double i, double j, double k) 
	{
		System.out.println(i+j+k);
	}
	
		
	
}


public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		casio ch = new casio();
		ch.add(2, 3);
		ch.add(2, 3, 5);
		ch.add(2.5, 3.5, 4.5);
	}

}
