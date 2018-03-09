package src.com.school.entity;

import java.util.ArrayList;
import java.util.List;

/*
 * create on march 8th
 * 
 * 
 */
public class TestSchool {

	public static void main(String[] args)
	{
		
		Teacher lily=new Teacher(1,"lili",70000);
		Teacher mesha=new Teacher(2,"mesha",1000);
		Teacher nini=new Teacher(3,"nini",9000);
		
		
		List<Teacher> teachers=new ArrayList<>();
		teachers.add(lily);
		teachers.add(mesha);
		teachers.add(nini);
		
		
		Student meme=new Student(1,"mem",4,900);
		Student aeme=new Student(2,"aeme",5,100);
		
		List<Student> students=new ArrayList<>();
		students.add(meme);
		students.add(aeme);
		
		
		//list of teacher s and list of students
		School school=new School(teachers, students);
		
		
		meme.payFees(9000);
		aeme.payFees(7000);

		System.out.println("School has earned $"+school.getTotalMoneyEarned());
		
		System.out.println("----school pay salary to teachers---");
		
		System.out.println("school pay salary: ");
		
		
		lily.receiveSalary(lily.getSalary());
		
		System.out.println("school has spend on salary to teacher"+lily.getName()+"now has"+school.getTotalMoneyEarned());

		System.out.println(lily);
	}

}
