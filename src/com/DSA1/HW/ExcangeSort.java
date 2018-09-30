package com.DSA1.HW;

public class ExcangeSort {
	public static void main(String[] args) {
		int a = 0;
		int n[] = {1,3,5,4,2};
		for(int i = 0;i<n.length-1;i++)
		{for(int j = i+1;j<n.length;j++)
			{if(n[i]>n[j])
				{a = n[i];
				n[i] = n[j];
				n[j] = a;}
			}
			
		}
		for(int b=0;b<n.length;b++)
		{System.out.print(n[b] + " ");}
	}

}
