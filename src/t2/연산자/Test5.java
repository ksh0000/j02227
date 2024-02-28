package t2.연산자;

// 삼항 연산자 (조건식 ? 참 : 거짓 )
public class Test5 {
	public static void main(String[] args) {
		// 점수가 90점 이상이면 'A', 점수가 80점 이상이면 'b'점수가 70점 이상이면 'c'점수가 60점 이상이면 'd'점수가 60점 미만이면 'f'
		char res;
		int jumsu = 75 ;
		
		res = (jumsu >= 90) ?   'A': (jumsu >= 80)? 'B': (jumsu >= 70)? 'c': (jumsu >= 60)? 'd':'f';
		System.out.println("점수 : "+jumsu+"  은  "+res+" 학점 입니다.");
	
		
	}
}
