package arrayOfObjects;

public class Subject_Main 
{
public static void main(String[] args)
{
	Subject subs[]= new Subject[3];
	subs[0]= new Subject("s101","DS",100);
	subs[1]= new Subject("s102","Algorithms",100);
	subs[2]= new Subject("s103","os",100);
	for(Subject s:subs)
	{
		System.out.println(s);
	}
	Student student= new Student("ragni",598,"cs",subs[0]);
	System.out.println(student);
}
}
