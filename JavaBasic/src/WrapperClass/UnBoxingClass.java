package WrapperClass;

public class UnBoxingClass {
	public static void main(String[] args) {
		
		Double doubleObj=25.2566;// implicity
		System.out.println("doubleObj: "+doubleObj);
		//un-boxing
		double salary=doubleObj.doubleValue();// un-explicity
		System.out.println(salary);
		System.out.println(doubleObj==salary);// true
		
		Boolean b=true;// implicity
		boolean b1=b.booleanValue();//  un-explicity
		
		Character c1=new Character('a');// auto- explicity
		char c2=c1.charValue();// un-explicity
		
		Integer i=25; //implicity
		double d=i.intValue();// un-explicity
	}

}
