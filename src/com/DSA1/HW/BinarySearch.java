package com.DSA1.HW;

import java.util.Scanner;

public class BinarySearch {
	static int[] list = new int[10];
	static boolean power = true;
	public static void main(String args[]) {
		boolean by = false;
		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		Scanner sc = new Scanner(System.in);
			System.out.print("�п�J1~10���Ʀr");
			int beg = 1;
			int end = 10;
			int count = 0;
			int input = sc.nextInt();
			if (input > 0 && input <= list.length) {
				by = true;
				while (by) {
					int mid = (beg + end) / 2;
					if (input > mid) {
						beg = mid;
						if (beg == 9) {
							count++;
						}
						if (count > 0) {
							int tmp = 0;
							for (int i = beg - 1; i <= end - 1; i++) {
								if (list[i] == input) {
									tmp = i + 1;
								}
							}
							System.out.println("�b��" + tmp + "�Ӧ�m���Ʀr[" + end + "]");
							by = false;
						}
					} else if (input < mid) {
						end = mid;
						if (end == 2) {
							count++;
						}
						if (count > 0) {
							int tmp = 0;
							for (int i = beg - 1; i <= end - 1; i++) {
								if (list[i] == input) {
									tmp = i + 1;
								}
							}
							System.out.println("�b��" + tmp + "�Ӧ�m���Ʀr[" + beg + "]");
							by = false;
						}
					} else {
						int tmp = 0;
						for (int i = beg - 1; i <= end - 1; i++) {
							if (list[i] == input) {
								tmp = i + 1;
							}
						}
						System.out.println("�b��" + tmp + "�Ӧ�m���Ʀr[" + mid + "]");
						by = false;
					}
				}
			} else {
				System.out.println("���s�b�ǦC��");
			}
		}
	}
