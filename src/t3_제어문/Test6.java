package t3_제어문;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String res = "";
		
		System.out.print("수를 입력하세요? ");
		su = sc.nextInt();
		
		if (su % 2 < 1) res = "짝수";
		else res = "홀수";
		
		System.out.println(su + "은(는)" + res +"입니다.");
		sc.close();
	}
}
