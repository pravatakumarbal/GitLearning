// in java arrays arays are object
// array size is fixed
// by default it will create allocate heap memory for all the size with value 0
// if we know the values we can print the array values in array itself
// you can use array of objects

class student{
	
	int rollno;
	String name;
}


public class ArrayDemo {

	public static void main(String[] args) {
		// one dimensional array see below
	/*	int num [] = new int [4];
		int num1 [] = {1,3,9,27};
		num[0] =2;
		num[1] =8;
		num[2] =16;
		num[3] =32;
		
		for (int i=0; i<4; i++) {
			System.out.println(num[i]);
			System.out.println(num1[i]);
		}	
		// student class object declaration	
		student s[] = new student [4];
				
			
		// 2 dimensional array	
		
		int eid [][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				         };
			
		for (int j=0; j<4; j++) { // for rows
			
			for (int k =0; k<4; k++) { // column
				System.out.print("   " +eid[j][k]);
			}
			System.out.println();
		
		
	}*/
		// Jagged arfray = A jagged array is an array whose elements are arrays , nos f co;umns are not fixed. The elements of a jagged array can be of different dimensions and sizes
		

		int eid1 [][] = {
				{1,2,8,7},
				{5,6,7},
				{9,10,11,12,3,6,8}
				         };
		
		
     for (int p=0; p<eid1.length; p++) { // for rows p 0-3
			
			for (int q=0; q<eid1[p].length; q++) { // column
				System.out.print("   " +eid1[p][q]);
			}
			System.out.println();
		
     }
	}
}
