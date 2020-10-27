
public class CheckArmstrong 
{

	public static void main(String[] args) 
	{		 
	    int n=153,n2=189;
	    Armstrong armst = new Armstrong();
	    armst.Armst(n);
	    armst.Armst(n2);
	}
	void Armst(int num)
	{
		int c=0,a,temp; 
		temp=num;  
	    	while(num>0)  
	    	{  
	    		a=num%10;  
	    		num=num/10;  
	    	c=c+(a*a*a);  
	    	}  
	    	if(temp==c)  
	    		System.out.println(temp+" is an armstrong number.");   
	    	else  
	        	System.out.println(temp+" is not an armstrong number."); 
	}

}
