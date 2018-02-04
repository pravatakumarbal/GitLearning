
class ConstructorDemo {

	int num1;
	int num2;
	int result;
	
	//Default constructor
	ConstructorDemo(){
		
		num1=5;
		num2=8;
		result=num1+num2;
		
		System.out.println("in constructor");
	}
	
	//Parameterize  constructor
	
	ConstructorDemo(int i){
	
		num1=i;
		
		
	}
	//   Point for constructor
	//1. It will have same name as class name
	//2. constructor never return a value
	//3. When ever create object, constructor will be called automatically
	//4. 2 constructor can be available in same class provided they have different signature 
	
	
	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(7);
		
		System.out.println(cd.result);
		System.out.println(cd1.num1);
		

	}

}


