package com.DSA1.Recursive;
public class GCD {
	
	public int gcd(int a,int b) {
		if(b == 0) 
			return a;
		//�@�䰣��O0�A�t�@��N�O����᪺�l��
		else
		return gcd(b,a%b); 
		//��L��(b,a���Hb���l��)
	}	
	public static void main(String[] args) {
		GCD gcd = new GCD();
		System.out.println(gcd.gcd(5, 16));
	}

}
