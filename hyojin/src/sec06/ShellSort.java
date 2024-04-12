package sec06;

import java.util.Scanner;

//버블정렬
public class ShellSort {

	//단순삽입 정렬과 거의 같음
	//차이점은 선택한 요소와 비교하는 요소가 서로 이웃하지 않고 h칸만큼 떨어져 있다는 것이다. 
	//이 때 h의 초기값은 n/2이다.
	//for문으로 반복을 수행할 때마다 h를 2로 나누어 절반을 만든다.
	static void shellSort(int[]a, int n) {
		for(int h=n/2; h>0; h/=2) {
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
		
		System.out.println("셀 정렬");
		System.out.print("배열 길이:");
		int nx = sc.nextInt();
		int []x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		shellSort(x,nx); //배열x를 단순 교환 정렬(버블정렬)
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"]: "+x[i]);
		}
				
	}

}

