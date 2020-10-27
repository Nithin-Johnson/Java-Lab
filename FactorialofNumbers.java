
public class FactorialofNumbers {

	public static void main(String[] args) {
		int a=10,b=4;
		Factorial fact = new Factorial();
		fact.Fact(a);
		fact.Fact(b);
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
