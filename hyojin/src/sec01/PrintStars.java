package sec01;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n,w;
		System.out.println("*을 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		
		do {
			System.out.println("n값: ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		
		do {
			System.out.println("w값: ");
			w = stdIn.nextInt();
		}while(w<=0||w>n);
		
		
		/*
		 * for(int i=0;i<n;i++) { System.out.print("*"); if(i%w == w-1)
		 * System.out.println(); } if(n%w !=0) System.out.println();
		 */
		
		for(int i=0;i<n/w;i++) {
			//System.out.println("*".repeat(w));
		}
		int rest = n%w;
		if(rest != 0) {
			//System.out.println("*".repeat(rest));
		}
	}

}
