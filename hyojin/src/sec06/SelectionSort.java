package sec06;

import java.util.Scanner;

//버블정렬
public class SelectionSort {

	//배열요소a[idx1]과 a[idx2]의 값 교환
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//단순 삽입 정렬
	static void insertionSort(int a[],int n) {
		for(int i=1;i<n;i++) {
			int j;
			int tmp = a[i];
			//반복 제어용 변수 j에 i를 대입한 뒤
			//정렬된 열의 왼쪽 끝에 도달하거나 
			//tmp보다 작거나 같은 key를 갖는 항목[j-1]을 발견할 때까지
			//j를 1씩 감소시키면서 대입하는 작업을 반복
			for(j=i;j>0&& a[j-1]>tmp;j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단순 버블 정렬");
		System.out.print("배열 길이:");
		int nx = sc.nextInt();
		int []x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x,nx); //배열x를 단순 교환 정렬(버블정렬)
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"]: "+x[i]);
		}
				
	}

}

