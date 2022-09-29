package day1basicprogram;

public class Example8 {
	int age;
	boolean res;
	char grade;
	float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Example8 ref1 = new Example8();
     System.out.println("default age"+ref1.age);
     System.out.println("default res"+ref1.res);
     System.out.println("default grade"+ref1.grade);
     System.out.println("default roi"+ref1.roi);
     ref1.age=25;
     ref1.res=true;
     ref1.grade='b';
     ref1.roi=7.5f;
     System.out.println("updated age"+ref1.age);
     System.out.println("updated res"+ref1.res);
     System.out.println("updated grade"+ref1.grade);
     System.out.println("updated roi"+ref1.roi);
     
     
	}

}
