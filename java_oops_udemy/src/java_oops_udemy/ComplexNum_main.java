package java_oops_udemy;

public class ComplexNum_main {

	public static void main(String[] args) 
	{
		ComplexNum one = new ComplexNum(1.0, 1.0);
		ComplexNum number = new ComplexNum(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
		

	}

}
