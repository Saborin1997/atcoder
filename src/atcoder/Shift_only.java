package atcoder;

import java.util.Scanner;

public class Shift_only {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[N];
		int j = 0; 
		
		for(int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
		}
		
		boolean flag = true;
		
		while(flag) {
			for(int i = 0; i < N; i++) {
				if(n[i] % 2 == 0) {
					n[i] = n[i] / 2;
				}else {
					flag = false;
				}
			}
			if(flag == true) {
				j++;				
			}
		}
		System.out.println(j);
		sc.close();
	}
}
