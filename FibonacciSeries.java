package Day6;

public class FibonacciSeries {
	public static void main(String[] args) {
		int count=10;
		int Number1=0;
		int Number2=1;
		System.out.print(Number1+" "+Number2);
		int Number3 =0;
		for (int i=2; i<=count; i++){
			Number3=Number1 + Number2;
			System.out.print(" "+Number3);
			Number1=Number2;
			Number2=Number3;
		}
	}
}