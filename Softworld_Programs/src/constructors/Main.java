package constructors;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car car= new Car("toyota", "corolla", 2020);
		car.displayCarDetails();
		Car car2= new Car("BMW","1-series", 2023);
		System.out.println("------type 2---");
		car2.displayCarDetails();

	}

}
