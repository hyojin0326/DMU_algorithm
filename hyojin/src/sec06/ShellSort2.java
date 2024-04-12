package sec06;

import java.util.Scanner;

//버블정렬
public class ShellSort2 {

	// 셀 정열의 증분값(h)를 적용한것
	static void shellSort(int[]a,int n) {
		int h; //감소값
		//h의 초깃값을 구한다
		//1부터 시작하여 값을 3배하고 1을 더하면서 n(배열a의 길이)를 넘지 않는 가장 큰 값
		//h에 대입한다.
		for(h=1;h<n;h=h*3+1);
		//셀정렬 버전1과 다른 점은 h값이 변하는 방법이다.
		//반복할 때마다 h값을 3으로 나눈다.
		//반복하여 마지막은 1이 된다.
		for(;h>0;h/=3) {
			for(int i=h;i<n;i++) {
				int j;
				int tmp = a[i];
				for(j=i-h;j>=0 && a[j]>tmp;j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("셀 정렬(버전2)");
		System.out.print("배열 길이:");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}

		shellSort(x, nx); // 배열x를 단순 교환 정렬(버블정렬)

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]: " + x[i]);
		}

	}

}
