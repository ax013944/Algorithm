package com.DSA1.Recursive;

public class Ackermann {
	
	public long recursiveAckermann(long m, long n) {
		if (m == 0)
			return n + 1;
		//�YM�O0�A�^��N+1
		else if (n == 0 && m > 0)
			return recursiveAckermann(m - 1, 1);
			//�YN�O0�BM���O0�A�^�Ǧ�M-1
		else
			return recursiveAckermann(m - 1, recursiveAckermann(m, n - 1));
		//�ѤU���O��N-1
		
	}

	public static void main(String[] args) {
		Ackermann ackermann = new Ackermann();

		System.out.println(ackermann.recursiveAckermann(3, 2));
//����
	}

}
