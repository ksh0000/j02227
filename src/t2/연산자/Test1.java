package t2.연산자;

public class Test1 {
	public static void main(String[] args) {
		int su = 0;
		System.out.println("1.su : "+ su);

		su = su + 1;
		System.out.println("2.su : "+ su);
		
		su += 1;
		System.out.println("3.su : "+ su);
		
		++su;
		System.out.println("4.su : "+ su);
		
		su++;
		System.out.println("5.su : "+ su);
		System.out.println("----------------------------");
		
		int res =0;
		res = su ;
		System.out.println("6.su : "+ res +" , res : " + res);
		
		res = ++su + 10; // su:5 res :15
		System.out.println("7.su : " +su + " , res: "+ res);
		
		res = su++ + 10; // su:6 res :15
		System.out.println("8.su : " +su + " , res: "+ res);
		
		res = --su + 10; // su:5 res :15
		System.out.println("9su : " +su + " , res: "+ res);
		
		res = su-- + 10; // su:4 res :15
		System.out.println("10su : " +su + " , res: "+ res);
		
		res = ++su + su-- +10; // su:4 res :20
		System.out.println("11su : " +su + " , res: "+ res);
		
		
		
	}
}
