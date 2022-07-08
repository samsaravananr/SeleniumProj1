
public class Demo5 extends Demo2 
{
	
	public static int vAge;
	
	public void Calc()
	{
		System.out.println("Input Method");
		
	}
	
	public void Calc(String vName)
	{
		System.out.println("Name is "+vName);
	}
	
	
	public void Calc(String vName, int vAge)
	{
		System.out.println("Name is "+vName);
		System.out.println("Name is "+vAge);
		this.vAge=vAge;
	}
	
	public void Calc(int vAge, String vName)
	{
		System.out.println("Name is "+vName);
		System.out.println("Name is "+vAge);
	}

	public static void main(String[] args) 
	{
		
		Demo5 d5=new Demo5();
		d5.Calc();
		d5.Calc("Sam");
		d5.Calc("Ram", 25);
		System.out.println(vAge);
	
	

	}

}
