package AssignmentArray;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]array=new int[] {1234};
     int n=3;
     System.out.println("Original array");
     for(int i=0;i<array.length;i++) {
    	 System.out.println(array[i]);
     }
     
     for(int i=0;i<n;i++) {
    	 int k,first;
    	 first= array[0];
    	 for(k=0;k<array.length; i++) {
    		 array[k]=array[k+1];
    	 }
    	 array[k]=first;
    	 System.out.println("Array left rotation");
    	 for(int j =0;i<array.length;i++) {
    	 System.out.println(array[i]);
     }
	}

}
}