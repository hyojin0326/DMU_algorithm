package sec02;

import java.util.Scanner;

public class PhysicalExamination {
	static class PhyscData {
		String name;
		int height;

		PhyscData(String name, int height) {
			this.name = name;
			this.height = height;
		}
	}

	// 평균키 구하기
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[]x = {
				new PhyscData("강민하", 162),
				new PhyscData("김찬우", 173),
				new PhyscData("박준서", 175),
				new PhyscData("유서범", 171),
				new PhyscData("이수연", 168),
				new PhyscData("장경오", 174),
				new PhyscData("황지안", 169),
		};
		
		System.out.println("-----신체검사 리스트-----");
		System.out.println("이름    키");
		System.out.println("-----------------");
		for(int i=0;i<x.length; i++)
			System.out.printf("%-6s%3d\n", x[i].name, x[i].height);
		
		System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));
	}
}
