public class CheckOddEven {
	public static void main(String[] args) 
	{
		int a,b,c,d;
		a=10;
		b=5;
		c=a%2;
		d=b%2;
		if (c==0)
			System.out.println(a+" is an even number");		
		else
			System.out.println(a+" is an odd number");
		if (d==0)
			System.out.println(b+" is an even number");		
		else
			System.out.println(b+" is an odd number");
	}
}
