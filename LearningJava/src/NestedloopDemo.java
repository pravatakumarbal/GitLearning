/*Print below
* * * * *
* * * * *
* * * * *
* * * * *
* * * * **/


public class NestedloopDemo {

	public static void main(String[] args) {
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<5 ; j++) {
			System.out.print("*  ");
			}
			System.out.println();
		}

/*	Pattern 1
 *  1
	12
	123
	12345
	123456
	
	A
	AB
	ABC
	ABCD
	
	$$$$
	$  $
	$  $
	$$$$
	*
	*/
		
		for(int i=0; i<=5 ; i++) {
			System.out.print(i);
			for(int j=0; j<=i ; j++) {
			System.out.print(i);
			}
			System.out.println();
		}
		
		/// Loop with break;
		
		for(int p=0; p<=9 ; p++) {
			if(p>7) {
				break;
			}
			
			System.out.println("Value of p is ->" + p);
			
		}
		
		
	}

}
