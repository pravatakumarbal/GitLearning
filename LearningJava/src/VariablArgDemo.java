// for argument variable, declare variable inside the method as int ... n see below
//for 

class calc1{
	
	public int add(int ... n) { // this is called as variable length argument
		
		int sum = 0;
		for(int i: n) {
			
		sum = sum+i;	
		}
		return sum;
	}
	
}

public class VariablArgDemo {

	public static void main(String[] args) {
		
		calc1 obj = new calc1();
		
		System.out.println(obj.add(1,2,3,4,5,6,7,8,9,11,222,555,7777));
		
		
	}

}
