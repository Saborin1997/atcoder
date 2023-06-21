package atcoder;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//A:500円玉の枚数.
		int A = sc.nextInt();
		//B:100円玉の枚数
		int B = sc.nextInt();
		//C:50円玉の枚数
		int C = sc.nextInt();
		//X:合計金額
		int X = sc.nextInt();
		//j:合計金額をちょうどX円にするパターンの数
		int total = 0;
		
		for(int i = 0; i <= A; i++) {
			for(int j = 0; j <= B; j++) {
				for(int n = 0; n <= C; n++) {
					if(X == 500 * i + 100 * j + 50 * n) {
						total++;
					}
				}
			}
		}
		
		
		System.out.println(total);
		sc.close();
	}
}
