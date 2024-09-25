package com.bptn.course.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Fill in the code below
	     Scanner scan = new Scanner(System.in);

	     System.out.println ("Please enter an Integer:");
	     int num = scan.nextInt();

	     int factorial = 1;

	     int i = 1;

	while ( i <= num) {
	    factorial *=i;
	i++;
	}
	System.out.println("The factorial of " + num + " is: " + factorial);

	scan.close();

	}

}
