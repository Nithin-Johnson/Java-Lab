
public class PrintFactors 
{

	public static void main(String[] args) 
	{
		int i,n=44;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println("Factor of "+n+" = "+i);
		}
	}
}
