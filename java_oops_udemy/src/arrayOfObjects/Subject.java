package arrayOfObjects;

public class Subject 
{
private String subjid;
private String subName;
private int maxmarks;
private int marksObtain;
public Subject()
{
	
}

public Subject(String subjid, String subName) {
	super();
	this.subjid = subjid;
	this.subName = subName;
	
}
public Subject(int maxmarks, int marksObtain) {
	super();
	this.maxmarks = maxmarks;
	this.marksObtain = marksObtain;
}


public Subject(String subjid, String subName, int maxmarks) {
	super();
	this.subjid = subjid;
	this.subName = subName;
	this.maxmarks = maxmarks;
}

public String getSubjid() {
	return subjid;
}
public String getSubName() {
	return subName;
}
public int getMaxmarks() {
	return maxmarks;
}
public int getMarksObtain() {
	return marksObtain;
}
public void setMaxmarks(int maxmarks) {
	this.maxmarks = maxmarks;
}
public void setMarksObtain(int marksObtain) {
	this.marksObtain = marksObtain;
}
boolean isQualified()
{
	return marksObtain>=maxmarks/10*4;
}

@Override
public String toString() {
	return "Subject [subjid=" + subjid + ", subName=" + subName + ", maxmarks=" + maxmarks + ", marksObtain="
			+ marksObtain + "]";
}



}
