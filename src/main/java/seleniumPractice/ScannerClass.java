package seleniumPractice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter name");
      
    	String name=sc.nextLine();
    	System.out.println("User input is "+name);
	}

}
