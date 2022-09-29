package AssignmentArray;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]array=new int[] {10,2,1,3,4,5,6};
		   int temp=0;
		   for (int i=0;i<array.length;i++) {
			   for(int j=i;j<array.length;j++) {
				   if(array[i]<array[j]) {   
					  temp=array[i];
					  array[i]=array[j];
					  array[j]= temp;
				   }
			   }
		   }
		   for(int i=0;i<array.length;i++) {
			   System.out.println(array[i]); 
			   
		   }


	}

}
