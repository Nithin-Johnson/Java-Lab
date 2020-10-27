
public class CheckPrime 
{

	public static void main(String[] args) 
	{
		int a,b;
		a=10;
		b=7;
		CheckPrime check = new CheckPrime();
		check.Prime(a);
		check.Prime(b);
	}
	void Prime(int n)
	{
		int temp=0,p=0;
		for(int i=2;i<=n/2;i++)
		{
	       temp=n%i;
		   if(temp==0)
		   {
		      p=1;
		      break;
		   }
		}
		if(p==0)
			   System.out.println(n + " is a Prime Number");
			else
			   System.out.println(n + " is not a Prime Number");
	}
}
