//https://www.youtube.com/watch?v=IPJYL18NCpw&list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf&index=23

class A{
	
	public A() {
		System.out.println("In A");
	}
   public A(int i) {
	   System.out.println("In A but Int");
				
	}
	
}

class B extends A{
	
	public B() {
		super(5); // every constructor in sub class has by default a super method, even u don't mentioned it'll call automatically
		         // super method will by default call defualt constructor of base class
		         // if you want default constructor of B and Parametrise constructor A, then pass integr in super menthod of B defult constructore
		System.out.println("In B");
	}
   public B(int i) {
	   super(5); // if you pass parameter in super method, it will call parameter constructor of base calass
	   System.out.println("In B but Int");
				
	}
	
}
public class SuperMethodDemo {

	public static void main(String[] args) {
		
		A obj1=new A(); // it will call defult constructor of A
		
		B obj2=new B(); // As B extend A, it will call constructor of A and Constuctor of B
		A obj3= new A(2); // It will call parametrise constructor of A
		B obj4= new B(2); // Default constructor of A and parametr constructor of B
		// do call parametrise constructor of b and a pass uper menthod with parameter
		B obj5= new B(); // Default constructor of A and parametr constructor of B
		
	}

}
