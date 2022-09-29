package overl;

public class Large2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test5(55,98,87);
	}
public static void Test5(int i,int j, int k) {
	
	if ( i>=j && i>=k || j>=i && j>=k || k>=i && k>=j)
	{
		System.out.println("number is large");
	
	}
	else {
		System.out.println("number is not large");
	}
}
}
