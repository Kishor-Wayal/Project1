package HomeWork;

public class HomeWork12 {
 
	public static void main(String args[]) {
		//declaring and initializing 2D array  
		//int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 7,8,9,4} };//each entry is one row
		int arr[][]= {{1,2,3},{4,5},{7,8,9,4} };
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 System.out.println(arr[i][j] +" ");
			 }
		 }
		
	}
}
	