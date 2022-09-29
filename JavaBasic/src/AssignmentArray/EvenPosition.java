package AssignmentArray;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[]array=new int[] {1,2,3,4,5,6,7,};
  //Even
  System.out.println("Evenposition present");
  for(int i=1;i<array.length;i=i+2) {
	  System.out.println(array[i]);
  }
      //Odd
  System.out.println("Odd position present");
  for(int i=0;i<array.length;i=i+2) {
	  System.out.println(array[i]);
  }
	}

}
