package Techouts;

public class MultipleTrycatches {

	public static void main(String[] args) {
		try{
			int arr[]={2,3};
			arr[1]=3;
			arr[4]=4/0;
			}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception b){
			b.printStackTrace();
	}

}}
