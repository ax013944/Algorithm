package com.DSA1.HW;

import java.util.Scanner;

public class NlevelOperation {

	public static void main(String[] args) {
		System.out.println("¿é¤J¼Æ¦r:");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		int j = 1;
		for (int i = 1; i <= num; i++) {
			j = j * i;

		}
		System.out.println(num + "!=" + j);
	}

}
