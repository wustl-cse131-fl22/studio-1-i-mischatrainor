package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the first interger you would like to average?");
		int n1 = in.nextInt();
		System.out.print("What is the second interger you would like to average?");
		int n2 = in.nextInt();
		double average = (n1 + n2)/2.0;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");
	}

}
