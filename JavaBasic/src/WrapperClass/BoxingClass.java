package WrapperClass;

public class BoxingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age=20;
      System.out.println("age:"+age);
      Integer obj=45;//                 implicit/ auto boxing
     // obj=new Integer(45);
      System.out.println("obj:"+obj);
      
      Integer intobj1=new Integer(age);// explicity boxing operation
      System.out.println("intobj1:"+intobj1);
      char c1='z';
		Character xyz=c1;//implicit
		Character cObj2=new Character(c1);//explicit
		System.out.println(c1);
		System.out.println(xyz);
		System.out.println(cObj2);
	
	}

}
