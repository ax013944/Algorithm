package com.DSA1.Recursive;

import com.DSA1.Recursive.*;

public class Combination {
	public int recursiveCombination(int n, int m) {
		if(m == 0||n==m)
			//如果m是0或m是等於n，傳1
			return 1;
		else if(m>0&&m<n)
			return (recursiveCombination(n-1, m)+recursiveCombination(n-1, m-1));
		//剩下如果m大於0且m是小於n，傳組合公式
		else
			return 000;
		
			
	}
	
	public int nonRecursiveCombination(int n,int m) {
		Factorial f = new Factorial();
		return f.recursiveFactorial(n)/(f.recursiveFactorial(m)*f.recursiveFactorial(n-m));
	}
	
	public static void main(String[] args) {
		Combination combi = new Combination();
		System.out.println(combi.recursiveCombination(5, 3));
		System.out.println(combi.nonRecursiveCombination(5, 3));
	}

}
