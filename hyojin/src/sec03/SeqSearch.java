package sec03;

import java.util.Scanner;

public class SeqSearch {

	//길이가 n인 배열 a에서 key와 같은 요소를 선형검색
		/*static int seqSearch(int[]a, int n, int key) {
			int i=0;
			while(true) {
				if(i==n)
					return -1; //검색 실패
				if(a[i] == key)
					return i; //검색 성공
				i++;
			}
			
		}*/
		static int seqSearch(int[]a, int n, int key) {
			for(int i=0;i<n;i++) {
				if(a[i] == key)
					return i;
			}
			return -1;
			
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
			
			System.out.print("검색할 값: ");
			int search = sc.nextInt();
			
			int idx = seqSearch(x,num,search);
			if(idx==-1)
				System.out.println("검색 값의 요소가 없습니다.");
			else {
				System.out.println("검색할 값은 x["+ idx+"]에 있습니다.");
			}
			
			
		}

}
