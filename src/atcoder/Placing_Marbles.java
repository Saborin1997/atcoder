package atcoder;

import java.util.Scanner;

public class Placing_Marbles {

	public static void main(String[] args) {
//		すぬけ君は、1,2,3 の番号がついた3 つのマスからなるマス目を持っています。 
//		各マスには 0 か 1 が書かれており、マス i には s i が書かれています。
//		すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.replaceAll("0", "");
		System.out.println(s.length());
		
	}
}
