package com.DSA1.HW;

import com.DSA1.HW.SelectionSort;

public class SelectionSort {
	int data[] = { 10,20,30,50,60,40};


	public void showData() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");
	}

	public void sort() {
		int i, j, a;
		for (i = 0; i < data.length - 1; i++) {
			for (j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					a = data[i];
					data[i] = data[j];
					data[j] = a;
				}
			}

		}
	}

	public static void main(String[] rags) {
		SelectionSort b = new SelectionSort();
		b.showData();
		b.sort();
		b.showData();
	}
}
