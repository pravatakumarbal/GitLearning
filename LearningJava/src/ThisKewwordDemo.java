class ThiskwDemo{
	int num1;
	int num2;
	

	

	
	// This constructor will work if it has diffrent set of parameter like instance and local
	// But if instance and local parameter are same name, then it wll not work
	// Below will give correct result - > 8,9
	/*ThisKewwordDemo(int number1, int number2){
		num1=number1;
		num2=number2;*/
	// Below will give wrong  result - > 0,0
	
	/*ThisKewwordDemo(int num1, int num2){
	num1=num1;
	num2=num2;	*/
	
	// with this key word represent current  object
		
ThiskwDemo(int num1, int num2){
	this.num1=num1;
	this.num2=num2;	
	
	
	}
}
	public class ThisKewwordDemo {
	public static void main(String[] args) {
		
		ThiskwDemo th = new ThiskwDemo(8,9);
		System.out.println(th.num1);
		System.out.println(th.num2);
	}

}
