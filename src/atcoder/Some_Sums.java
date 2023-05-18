package atcoder;

import java.util.Scanner;

public class Some_Sums {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = 0;

		for(int i = 1; i <= n; i++){
			if(check(i, a, b)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
	
	//1 以上 N 以下の整数のうち、10 進法での各桁の和が A 以上 B 以下であるものを判定するメソッド。
	public static boolean check(int i , int a , int b){
		int sum = 0;
		while(i > 0){
			sum += i % 10;
			i /= 10;
		}
		if(a <= sum && sum <= b){
			return true;
		}else
			return false;
	}
}
