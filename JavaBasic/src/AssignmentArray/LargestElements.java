package AssignmentArray;

public class LargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[]array =new int[] {23,44,55,123,66,99};
    int maxNumber=array[0];
    for(int i=0;i<array.length;i++) {
    	if (array[i]>maxNumber) {
    		maxNumber=array[i];
    	}
    }
    System.out.println("The largest Number"+ maxNumber);
    
    //Small Number
    
    int min=array[0];
    for(int i=1;i<array.length;i++) {
  	  if (min>array[i]) {
  		  min=array[i];
  	  }
    }
    System.out.println("Minimum element"+min);
    
    	}

}
      










