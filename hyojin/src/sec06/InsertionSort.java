package sec06;

import java.util.Scanner;

//버블정렬
public class InsertionSort {

	//배열요소a[idx1]과 a[idx2]의 값 교환
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//단순 선택 정렬
	static void selectionSort(int[]a, int n) {
		for(int i=0;i<n-1;i++) {
			//min : a[i],...a[n-1](아직 정렬되지 않은 부분)에서 값이 가장 작은 요소의 인덱스를 저장
			int min =i;
			for(int j=i+1;j<n;j++) {
				if(a[j] <a[min]) {
					//a[j]와 a[min]의 값을 교환
					min=j;
				}
			}
			//아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
			swap(a,i,min);
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
		
		selectionSort(x,nx); //배열x를 단순 교환 정렬(버블정렬)
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"]: "+x[i]);
		}
				
	}

}

