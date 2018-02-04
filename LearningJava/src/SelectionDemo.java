
public class SelectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// IF
				int i=20, j=30, k=0;
				if (i>j) {
					System.out.println("i is greater ");
					k=100;
					System.out.println(k);
				}
					else
						System.out.println("j is greater ");
				        k=200;
				        System.out.println(k);
					
		
		
// Ternary operator
					
					
					k=i>j?100:200;
					System.out.println(k);
					
// Switch
					
// Can we use string in switch - Yes - after java 1.7 onwards
					
									
					
					int n=11;
					String d="abc";
					
					switch(n) {
					
					case 1:
						System.out.println("one");
						break;
					case 2:
						System.out.println("two");
						break;
					case 3:
						System.out.println("three");
						break;
					case 4:
						System.out.println("four");
						break;
					default: System.out.println("five");
					}
					
					switch(d) {
					
					case "dabc":
						System.out.println("sat");
						break;
					case "pqr":
						System.out.println("sun");
						break;
					default: System.out.println("weekday");
						
						
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
			
				}

}
