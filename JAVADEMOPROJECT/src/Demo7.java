
public class Demo7 extends Demo2 
{
	
	public static int vAge;
	
	public final static int vAadhar=10001;
	
	
	public Demo7(String vName, int vAge)
	{
		System.out.println("Name is "+vName);
		System.out.println("Name is "+vAge);
		this.vAge=vAge;
	}
	
	
	public static void main(String[] args) 
	{
		
		Demo7 d5=new Demo7("Ram", 25);
		//vAadhar=200002;
		System.out.println(vAadhar);
		
	
	

	}

}
