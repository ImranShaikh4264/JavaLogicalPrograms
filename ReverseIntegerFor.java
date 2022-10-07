package Day6;

public class ReverseIntegerFor {
	public static void main(String[] args) {
		int Integer = 123456789, reverse = 0;
		System.out.println("Given Integer is : " + Integer);
		for (; Integer != 0; Integer = Integer / 10) {
			int remainder = Integer % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given Integer is: " + reverse);
	}

}
