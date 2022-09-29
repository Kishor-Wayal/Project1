package AssignmentArray;

public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] array=new int[] {1,2,3,4,5};
    int n=3;
    System.out.println("Original Array");
    for(int i=0;i<array.length;i++) {
    	System.out.println(array[i]+" ");
    }
    for(int i=0;i<n;i++) {
    	int j,last;
    	last=array[array.length-1];
    	for(j=array.length-1;j>0;j--) {
    		array[i]=array[j-1];
    		
    	}
    	array[0]=last;
    	System.out.println("Array after right roatate");
    	for(int k=0;i<array.length;i++) {
    		System.out.println(array[i]);
    	}
    }
    
    
    
	}

}
