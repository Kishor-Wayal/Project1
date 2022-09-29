package AssignmentArray;

public class SmallestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]array=new int[] {55,33,66,99,22};
      int min=array[0];
      for(int i=1;i<array.length;i++) {
    	  if (min>array[i]) {
    		  min=array[i];
    	  }
      }
      System.out.println("Minimum element is"+min);
	}

}
