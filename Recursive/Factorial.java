package com.DSA1.Recursive;

public class Factorial {

	public int recursiveFactorial(int n) {
		int ans;
		if (n == 1) {
			ans = 1;
			//如果n是1，傳1
		} else {
			ans = n * recursiveFactorial(n - 1);
			//如果n不是1，傳n*(n-1)!,並回傳
		}
		return ans;
	}

	public int nonRecursiveFactorial(int n) {
		int count = n;
		for (int i = n; i > 1; i--) {
			count = count * (i - 1);
			//一直乘-1後的數
		}return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();

		System.out.println(factorial.recursiveFactorial(5));
		System.out.println(factorial.nonRecursiveFactorial(5));
	}

}
