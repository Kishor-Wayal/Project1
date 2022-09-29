package MultiArray;
import java.util.Arrays;
public class array1 {
	
	
		public static void main(String[] args) {
			// declaring a source array
			char[] A = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
			// declaring a destination array
			char[] copyTo=Arrays.copyOf(A, A.length);
			for(int i=0;i<copyTo.length;i++) {
				System.out.print(copyTo[i]);
			}
			System.out.println();
			System.out.print("************Copy using range****************");
			
			char[] copyWithRange=Arrays.copyOfRange(A, 3, A.length);
			for(int i=0;i<copyWithRange.length;i++) {
				System.out.print(copyWithRange[i]);
			}
			System.out.println();
			System.out.println("****************After Sorting********************");
			Arrays.sort(copyWithRange);
			for(char c: copyWithRange) {
				System.out.print(c);
			}
		}
	}

