package t1_varible;
//실수 자료형 (float(4byte), double(8byte))
public class Test4 {
	public static void main(String[] args) {
		double dd1, dd2 ;
		dd1 = 3.141592 ;
		dd2 = 3.141592234543612 ;
		System.out.println("dd1 : "+ dd1);
		System.out.println("dd2 : "+ dd2);
		
		float ff1, ff2 ;
		ff1 =3.14f;// float 는 뒤에 f를 붙힌다
		System.out.println("ff1 : "+ ff1);
		
		ff2 = 3.141592234543612f;
		System.out.println("ff2 : " + ff2);
		
		double dd3 = 5E3, dd4 = 5E-3;
		System.out.println("dd3 : "+ dd3);
		System.out.println("dd4 : "+ dd4);
		
	}
}
