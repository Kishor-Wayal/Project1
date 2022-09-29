package ObjectClass;
class demo123{
	void display() {
		System.out.println("i am display of class demo");
	}
}
public class Example3 extends demo123 {
	static int last_roll = 100;
	int roll_no;
    Example3()
    {
    	roll_no =last_roll;
    	last_roll++;
    }
    @Override
    void display() {
    	System.out.println("I am display of class objectClass2");
    }
    @Override
    public int hashCode() {
    	return roll_no;
    }
	public static void main(String[] args) {
		Example3 s=new Example3();
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s.hashCode());
        s.display();
        demo123 d2= new demo123();
        System.out.println(d2);
        System.out.println(d2.hashCode());
        d2.display();
	}

}
