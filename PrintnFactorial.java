
public class PrintnFactorial {

	public static void main(String[] args) {
		int n=5;
		Factorial fact = new Factorial();
		int i=1;
		while(i<=n)
		{
			fact.Fact(i);
			i++;
		}
		
	}
	void Fact(int n){
		int i=1,f=1;
		while(i<=n)
		{
			f*=i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+f);
	}

}
