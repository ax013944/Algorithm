package com.DSA1.Recursive;

public class Ackermann {
	
	public long recursiveAckermann(long m, long n) {
		if (m == 0)
			return n + 1;
		//若M是0，回傳N+1
		else if (n == 0 && m > 0)
			return recursiveAckermann(m - 1, 1);
			//若N是0且M不是0，回傳成M-1
		else
			return recursiveAckermann(m - 1, recursiveAckermann(m, n - 1));
		//剩下都是傳N-1
		
	}

	public static void main(String[] args) {
		Ackermann ackermann = new Ackermann();

		System.out.println(ackermann.recursiveAckermann(3, 2));
//執行
	}

}
