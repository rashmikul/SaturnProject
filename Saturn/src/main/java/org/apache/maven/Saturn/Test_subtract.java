package org.apache.maven.Saturn;

import java.util.Scanner;

public class Test_subtract {

	public static void main(String[] args) {
		int p, q, r;
		System.out.println("Enter two integers to calculate their substraction: ");
		Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
		p = sc.nextInt(); //scan data for input of integer value 
		q = sc.nextInt();
		r = p - q;
		System.out.println("substraction of entered integers = "+r);
		}

	public static int t(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}



	}


