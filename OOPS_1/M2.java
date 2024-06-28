import java.lang.*;
import java.util.*;
class Subject
{
	private String subId;
	private String name;
	private int maxMarks;
	private int marksObtained;
	public Subject(String subId,String name,int maxMarks)
	{
		this.subId = subId;
		this.name = name;
		this.maxMarks = maxMarks;
	}
	public void setMarksObtained(int marksObtained)
	{
		this.marksObtained = marksObtained;
	}
	public String toString()
	{
		return "\nSub Id: "+subId+"\nName: "+name+"\nMax Marks: "+maxMarks+"\nMarks Obtained: "+marksObtained;
	}
}
class Student
{
	private int rollNo;
	private String name;
	private String department;
	private Subject sub[];
	Student(int rollNo,String name,String department)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
	}
	public void setSubjects(Subject ...A)
	{
		sub = new Subject[A.length];
		for(int i = 0;i<A.length;i++)
		{
			sub[i] = A[i];
		}
		
	}
	public String toString()
	{
		String str = "\nRoll No: "+rollNo+"\nName: "+name+"\nDepartment: "+department+"\nSubjects:\n";
		for(int i = 0;i<sub.length;i++)
		{
			str = str +"\n"+ sub[i];
		}
		return str;
	}
}
class M2
{
	public static void main(String args[])
	{
		//creating the array of subjects
		Subject sub[] = new Subject[3];
		sub[0] = new Subject("101","ALGORITHMS",100);
		sub[0].setMarksObtained(98);
		sub[1] = new Subject("102","OS",100);
		sub[1].setMarksObtained(95);
		sub[2] = new Subject("103","DBMS",100);
		sub[2].setMarksObtained(92);
		// creating the sudent object
		Student s1 = new Student(114,"Nishaad Mishra","CSE");
		s1.setSubjects(sub[0],sub[1],sub[2]);
		System.out.println(s1);
	}
}