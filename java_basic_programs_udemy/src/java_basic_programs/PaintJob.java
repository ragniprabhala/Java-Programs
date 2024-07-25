package java_basic_programs;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=getBucketCount(3.4,2.1,1.5,2);
		System.out.println(a);
	}
	public static int getBucketCount(double width,double height,double d,int extraBuckets)
	{
		int bucketsToCarry=0;
		
		if(width<=0||height<=0||d<=0||extraBuckets<0)
		{
			return -1;
		}
		
		else {
			double area=width*height;
			
		double totalBuckets= (area/d);
	 bucketsToCarry=	(int) Math.ceil(totalBuckets-extraBuckets);
		
		}
		return bucketsToCarry;
		
	}

}
