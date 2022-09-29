package Assignment;

public class LargestAmoung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three(100,55,94);

	}
	
	public static void Three(int i,int j,int k) {
	 
		 if(i>=j && i>=k) {
			System.out.println("Largest No is i "+i);
		}
	else if(j>=i && j>=k) {
			System.out.println("Largest No is j "+j);
		}
		else if (k>=i && k>=j)
			System.out.println("Largest No is k "+k);
		}
	
	}


