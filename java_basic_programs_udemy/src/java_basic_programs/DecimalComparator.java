package java_basic_programs;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean val=areEqualByThreeDecimalPlaces(3.1756,3.175);
		System.out.println(val);
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double a,double b)
    {
        int aa=(int) (a*1000);
        int bb=(int) (b*1000);
        //System.out.println(aa);
        if(aa==bb)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }

}
