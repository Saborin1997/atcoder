package atcoder;

import java.util.Scanner;

public class Product {
	public static void main(String[] args){
		//シカのAtCoDeerくんは二つの正整数 a,b を見つけました。 a と b の積が偶数か奇数か判定してください。
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a * b % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}