package HomeWork;

import java.util.Scanner;

public class String1  {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 2;//
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs "+e);
		} catch (Exception e) {
			System.out.println("Parent Exception occurs "+e);
		
		}}}