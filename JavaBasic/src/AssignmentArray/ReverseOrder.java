package AssignmentArray;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[]array1=new int[] {1,2,3,4,5,6,7};
    System.out.println("The Original Array");
    for(int i=0;i<array1.length;i++) {
    	System.out.println(array1[i]+" ");
    }
    System.out.println();
    System.out.println("The Reverse Array");
    for(int i=array1.length-1; i>=0; i--) {
    	System.out.println(array1[i]+" ");
    }
	}

}
