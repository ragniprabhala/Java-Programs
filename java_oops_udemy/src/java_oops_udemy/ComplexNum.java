package java_oops_udemy;



public class ComplexNum 
{
private double realnum;
private double imaginaryNum;
public ComplexNum(double realnum,double imaginaryNum)
{
	this.realnum=realnum;
	
	this.imaginaryNum=imaginaryNum;	
	
}

public double getReal()
{
	return realnum;
}
public double getImaginary()
{
	return imaginaryNum;
}

public void add(double real,double imaginary)
{
	
    realnum=realnum+real;
    imaginaryNum=imaginaryNum+imaginary;
    
}


public void add(ComplexNum cn)
{
	add(cn.realnum, cn.imaginaryNum);
	

}
public void subtract(double real,double imaginary)
{
	
	realnum=realnum-real;
    imaginaryNum=imaginaryNum-imaginary;
    
}
public void subtract(ComplexNum cn)
{
	subtract(cn.realnum,cn.imaginaryNum);
	
	
}

}
