
public class CheckPalindrome 
{
	public static void main(String[] args) 
	{		  	 
		 int n=454,n2=563;
		 Palindrome palin = new Palindrome();
		 palin.Palin(n);
		 palin.Palin(n2);
	}
	void Palin(int num){
		int temp=num,sum=0,r;    
		 while(num>0){    
			 r=num%10;  
			 sum=(sum*10)+r;    
			 num=num/10;			
		 }    
		 if(temp==sum)    
			 System.out.println(temp+" is a palindrome number.");    
		 else    
			 System.out.println(temp+" is not a palindrome number.");
	}
	

}
