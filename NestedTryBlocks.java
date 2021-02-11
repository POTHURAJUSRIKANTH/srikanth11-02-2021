package Techouts;

public class NestedTryBlocks {

	public static void main(String[] args) {
		try{
			int arr[]={2,3};
			arr[1]=3;
			try
			{
				arr[6]=2;
			}catch(Exception b){
				b.printStackTrace();
				}
			}catch(ArithmeticException e){
				e.printStackTrace();

		System.out.println("print first");
			}
	}}
