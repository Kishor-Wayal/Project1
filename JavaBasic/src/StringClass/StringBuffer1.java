package StringClass;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb = new StringBuffer("Hello");
       System.out.println("Original String Buffer:"+sb);
       sb.append("Java");
       System.out.println(sb);
       sb.insert(5, "Pune");
       System.out.println(sb);
       sb.replace(1, 3, "xxx");
       System.out.println(sb);
       sb.delete(1, 4);
       System.out.println(sb);
       StringBuffer s2=new StringBuffer("Pune is know for IT");
       s2.reverse();
       System.out.println(s2);
       
       StringBuffer s3=new StringBuffer();
       s3.append("I am from automation area");
       System.out.println("3rd Word:"+s3);
       System.out.println(s3.capacity());
	}

}
