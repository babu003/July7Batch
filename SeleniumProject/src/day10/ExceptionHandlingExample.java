package day10;

public class ExceptionHandlingExample {


	public static void main(String[] args) {
		System.out.println("Java");
		try
		{
			System.out.println(100/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Selenium");

	}

}






