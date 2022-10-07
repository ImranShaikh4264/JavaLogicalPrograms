package Day6;

public class PrimeNumberSeries {
	public static void main(String args[]){    
		  int i,flag=0;      
		  int Number=5;         
		  if(Number==0||Number==1){  
		   System.out.println(Number+" is not prime number");      
		  }
		  else{  
		   for(i=2;i<Number;i++){      
		    if(Number%i==0){      
		     System.out.println(Number+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(Number+" is prime number"); }  
		  }  
		}    

}
