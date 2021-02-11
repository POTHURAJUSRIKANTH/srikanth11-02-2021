package Techouts;

public class ExceptionHandling {
	public static void main(String args[])
	{
		System.out.println("executing the programme");
		 try{
			int a=10;
			int b=20;
			int c=a/b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		    }
		 catch(Exception ae)
		 {	ae.printStackTrace();//everything will be printed
		 System.out.println(ae.toString());;;;;;;//reason can be printed
		 System.out.println(ae.getMessage());
		 }finally{}
		 System.out.println("executing the Exception Handling programme");
		
	}

}
