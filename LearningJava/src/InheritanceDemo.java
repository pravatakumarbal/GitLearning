// super class has limited feature and will inherit to another class and more methods
// for example supe class has only addition, now we are extending the super class and creating a sub class with additional feature 
// IS - A , HAS -A
// When a class extend another class then that is IS-A
// when aver a class has a object of other class then has -A Ex- add has it in VeryAdvancecalc
class Claculator{ // super class, parent class, base class
	
	public int add ( int i, int j) {
		
		return i+j;
		
	}
}

class AdvCalculator extends Claculator { // sub class, child  class , derived class
	
	public int sub (int i, int j) {
		
		return (i-j);
		
	}
	
}

class VeryAdvCalculator extends AdvCalculator{
	
	public int multi(int i, int j) {
		
		return i*j;
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		Claculator obj = new Claculator(); // Super class object
		int result1 = obj.add(4, 5);
		System.out.println(result1);
		
		AdvCalculator advobj = new AdvCalculator(); // inherited calss object
		int result2 = advobj.add(411, 511);
		int result3 = advobj.sub(10,7);
		System.out.println(result2);
		System.out.println(result3);
		
		VeryAdvCalculator veryadvobj = new VeryAdvCalculator(); // Multilevel inheritance // java doen't support multiple inheritance
		int result4 = veryadvobj.add(411, 511);
		int result5 = veryadvobj.sub(10,7);
		int result6 = veryadvobj.multi(100,77);
		System.out.println("Addition:  "+result4);
		System.out.println("Substraction:  "+result5);
		System.out.println("Multiplication:  "+result6);

	}

}
