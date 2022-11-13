package com.delhi;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
	int sid;
	String sname;
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public String toString() {
		return sid+"--"+sname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sid, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid && Objects.equals(sname, other.sname);
	}
	
}
public class CustomizeSet {
	public static void main(String[] args) {
		Student std1=new Student(101, "Ramakant");
		Student std2=new Student(102, "Shyamakant");
		Student std3=new Student(101, "Ramakant");
		Student std4=new Student(102, "Shyamakant");
		Student std5=new Student(101, "Ramakant");
		Student std6=new Student(102, "Shyamakant");
		Set<Student> hs=new HashSet<Student>();
		hs.add(std1);
		hs.add(std2);
		hs.add(std3);
		hs.add(std4);
		hs.add(std5);
		hs.add(std6);
		System.out.println(hs);
		
	}

}
