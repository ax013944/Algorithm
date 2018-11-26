package com.DSA1.Recursive;

public class FibonacciNumbers {

	public int recursiveFibNum(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return recursiveFibNum(n - 1) + recursiveFibNum(n - 2);
	}

	public int nonRecursiveFibNum(int n) {
		if (n == 0 || n == 1)
			return n;
		//若N是0或1，傳N
		else if (n == 2)
			return 1;
		//若N是2，傳1
		else {
			int a = 0, b = 1, c = 1, i;
			for (i = 3; i <= n; i++) {
				a = b;
				b = c;
				c = a+b;
			}return c;
		//最初的值，A代表0，B代表1，C代表2，往後就是一直加
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumbers fn = new FibonacciNumbers();
		System.out.println(fn.nonRecursiveFibNum(5));
		System.out.println(fn.recursiveFibNum(5));
		
	}

}
