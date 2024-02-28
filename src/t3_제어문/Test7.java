package t3_제어문;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2;
		
	  System.out.print("첫번쨰 수를 입력하세요 ?");
	  su1 =sc.nextInt();
	  
	  System.out.print("두번째 수를 입력하세요 ?");
	  su2 =sc.nextInt();
	  
	  if (su1 > su2) {
	  	System.out.println("큰수는 "+ su1 +" 이고 작은수는 "+ su2 +" 입니다."); 
	  }
	  else if (su1 == su2) {
	  	System.out.println(su1+"와"+su2+"는 크기가 동일하다.");
	  }
	  else {
			System.out.println("더 큰수는(은)"+ su2 +" ,더 작은수는(은)" + su1 +"입니다.");
	  }
  	
	  sc.close();
	}
}