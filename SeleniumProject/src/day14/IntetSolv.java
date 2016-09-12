package day14;

public class IntetSolv {

	int price;
	String course;
	public void courseDetails(int price,String course)
	{
		this.price=price;
		this.course=course;
	}
	public static void main(String[] args) {
		IntetSolv i=new IntetSolv();
		i.courseDetails(5000,"Selenium");
		System.out.println(i.price+"--"+i.course);
	}

}









