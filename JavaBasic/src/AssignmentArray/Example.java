package AssignmentArray;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array1=new int[] {1234};
		int array2[]=new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		
		System.out.println("Element of original array");
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		
		
		System.out.println("Element of new arrya");
		for (int i=0;i<array2.length;i++) {
		System.out.println(array2[i]);
			}

}
}
