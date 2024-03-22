package sec03;

import java.util.Scanner;

public class SeqSearchEx {

	//선형검색의 과정을 자세하게 출력
	static int seqSearchEx(int a[], int n, int key) {
		System.out.print("   |");
		for(int i=0;i<n;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		System.out.print("---+");
		for(int i=0;i<4*n+2;i++) {
			 System.out.print("-");
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n",(i*4)+3),"");
			System.out.printf("%3d|",i);
			for(int k=0;k<n;k++) {
				System.out.printf("%4d", a[k]);
			}
			System.out.println("\n   |");
			if(a[i] == key)
				return i; //검색 성공
		}
		return -1; //검색실패
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int x[] = new int[num];
		for(int i=0;i<num;i++) {
			System.out.printf("x[%d]: ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색 값: ");
		int search = sc.nextInt();
		
		int idx = seqSearchEx(x, num, search);
		
		if (idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else {
			System.out.println("검색할 값은 x[" + idx + "]에 있습니다.");
		}
		
	}

}
