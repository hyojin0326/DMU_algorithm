package sec01;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n,w;
		System.out.println("*�� n�� ����ϵ� w������ ���� �ٲ㼭 ����մϴ�.");
		
		do {
			System.out.println("n��: ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		
		do {
			System.out.println("w��: ");
			w = stdIn.nextInt();
		}while(w<=0||w>n);
		
		
		/*
		 * for(int i=0;i<n;i++) { System.out.print("*"); if(i%w == w-1)
		 * System.out.println(); } if(n%w !=0) System.out.println();
		 */
		
		for(int i=0;i<n/w;i++) {
			System.out.println("*".repeat(w));
		}
		int rest = n%w;
		if(rest != 0) {
			System.out.println("*".repeat(rest));
		}
	}

}
