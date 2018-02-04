// if a class is required to have inside a class then we can create inner class
// outer class will be shaved as outer.class, InnerClassDemo.class but inner class will be shaved as outer$inner.class
// we may can use static variable, staic method and static class
// while inner class is static then no need to create inner class object form outer class object, this can be done directly from outer class itself see below
// inner class are 3 types 1. memebr class - without static keywords 2. static class 3. anonymous class
// 

class outer{
	
	//int a;
	static int b;
	//public void show() {
	static public void show() {
		
	}
	
	//class inner{
	static class inner{
		
		public void dispaly() {
			
			System.out.println("in display");
		}
	}
	
}


public class InnerClassDemo {

	public static void main(String[] args) {
		
		outer otobj = new outer();
		otobj.show();
// inorder to user the inner classs use outer.inner AND inorder to create inner classs object use outer calass object
		//outer.inner inobj = otobj.new inner(); ---without static 
		outer.inner inobj1 = new outer.inner(); // with static 
		
		//inobj.dispaly();
		inobj1.dispaly();
		
		
	}

}
