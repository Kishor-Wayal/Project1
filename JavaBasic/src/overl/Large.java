package overl;

public class Large {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Three(59,55,300);

		}
		
		public static void Three(double i,int j,int k) {
		 
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


