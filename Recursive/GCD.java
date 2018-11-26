package com.DSA1.Recursive;
public class GCD {
	
	public int gcd(int a,int b) {
		if(b == 0) 
			return a;
		//一邊除到是0，另一邊就是輾轉後的餘數
		else
		return gcd(b,a%b); 
		//其他傳(b,a除以b的餘數)
	}	
	public static void main(String[] args) {
		GCD gcd = new GCD();
		System.out.println(gcd.gcd(5, 16));
	}

}
