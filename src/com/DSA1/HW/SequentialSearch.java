package com.DSA1.HW;

import java.util.Scanner;

public class SequentialSearch {
	static int[] nums = new int[100];

	public static int sequentialsearch(int key) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return key;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			nums[i] = i;
		}
		Scanner sc1 = new Scanner(System.in);
		int search = sc1.nextInt();
		if (search < nums.length) {
			System.out.print(sequentialsearch(search));
		} else {
			System.out.println("Err�Gover range");
		}

		sc1.close();
	}
}
