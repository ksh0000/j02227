package t2.연산자;

// 삼항 연산자 (조건식 ? 참 : 거짓 )
public class Test4 {
	public static void main(String[] args) {
		// 점수가 60점 이상은 '합격', 60점 미만은 '불합격' 이라고 출력하시오 (string 변수를 담아서 출력하시오)
		String res;
		int su = 85;
		
		res = (su>= 60)? "합격" : "불합격";
		System.out.println("점수 "+ su +"는 "+res+"입니다.");
		
	}
}
