package Techouts;

public class ThrowCatch
{
	 static void Validate(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("please enter valid age");
	}
	else{
		System.out.println("you are eligible for vote");
	}
}}