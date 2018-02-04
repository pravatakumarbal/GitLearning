
public class OperatorDemo {
	
	/*Arithmetic [ +, -, *, /, % ]
	Bitwise
	Relational
	Logical*/

	public static void main(String[] args) {
		
		int i = 99, j= 5;
		
		int p = i+j;
		int q = i-j;
		int r = i*j;
		int s = i/j;  // only quotient
		int t = i%j;  // Reminder 
		
		i+=j;
		j-=i;
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		System.out.println(i);
		System.out.println(j);
		

	}

}
