package Day6;

public class ReverseIntegerWhile {
	public static void main(String[] args)   
	{  
	int Integer = 123456789, reverse = 0;
	System.out.println("Given Integer is : "+Integer);
		while(Integer != 0)   {  
			int remainder = Integer % 10;  
			reverse = reverse * 10 + remainder;  
			Integer = Integer/10;  
		}  
	System.out.println("The reverse of the given Integer is: " + reverse);  
	}  
}
