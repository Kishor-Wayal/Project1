package WhileLoop;

public class SimpleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1=10,num2=20;
    String opperation = "Mul";
    
    switch (opperation) {
    case "Add":
    	System.out.println(num1+num2);
    	break;
    case "Mul":
    	System.out.println(num1*num2);
        break;
    case "Sub":
    	System.out.println(num1-num2);
        break;
    case "Div":
    	System.out.println(num1/num2);
        break;
        default:
        	System.out.println("Enter valid operation");
    }
	}

}
