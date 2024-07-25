package OverloadingOverRiding;

public class methodOverloadingOverRiding 
{
	public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    protected int add()
    {
    	System.out.println("super class add method");
    	return 8;
    //	System.out.println("super class add method");
    }
}
class overloading extends methodOverloadingOverRiding
{
	
	public int add(int a, int b, int c) {
        return a + b + c;
    }
	
	public double add(double a, double b) {
        return a + b;
    }
	@Override
    public int add()
	{
		super.add();
		System.out.println("subclass add method");
		return 6;
	}
}