
public class Demo4 
{
	
	
	public static int a;
	
	public static void output()
	{
		System.out.println("This is output Method");
	}
	
	public void Input()
	{
		System.out.println("Input Method");
	}

	public static void main(String[] args) 
	{
		
		Demo2 d2=new Demo2();
		d2.Display();
		
		Demo4 d4=new Demo4();
		d4.Input();
	
		//a=10;
		
		
		Demo4.a=10;
		Demo4.output();
		
		System.out.println(a);
		

	}

}
