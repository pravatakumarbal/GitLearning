class Employee{
	
	int empid;
	int empsal;
	
	// if you don't want to make variable as object secific then use static, which will be same for all the object
	// the latest onject variable value will be assined to all the onject
	// in the below case if there is no static then -- both employee will have different ceo, but incase static they will have lates. ject ceoon
	
	static String ceo;
	
	static { // static block executed during class loading, then it will reference to object later
		ceo ="harry";
	}
	
	public void showdata() {
		
		System.out.println(empid + ":" + empsal + ":" + ceo);
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Employee pravata = new Employee();
		pravata.empid=1234;
		pravata.empsal=9999;
		//pravata.ceo="Ramkumar";
		
		Employee madhu = new Employee();
		madhu.empid=5678;
		madhu.empsal=8888;
		//madhu.ceo="samsundar";
		
		pravata.showdata();
		madhu.showdata();
		
	}

}
