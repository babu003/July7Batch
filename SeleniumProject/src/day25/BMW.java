package day25;

public class BMW  extends Car{

	String model;
	public void stop()
	{
		System.out.println("This is to stop the car");
	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.model="X4";
		b.stop();
		b.price=1111;
		b.start();

	}

}
