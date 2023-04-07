package com.java;

import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception,SQLException{

		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of A");
		a = sc.nextInt();

		System.out.println("Enter value of B");
		b = sc.nextInt();

		try {
			c = a / b;
			System.out.println("The value of c is " + c);
			
			
			
		} catch (ArithmeticException dileep) {
			
			dileep.printStackTrace();

			System.out.println("Can not divde with zero");

		}catch(NullPointerException n) {
			System.out.println("Can not divde with zero");

		}finally {
			System.out.println("Hello ravi");
		}
			Thread.sleep(2000);
		

	}

}
