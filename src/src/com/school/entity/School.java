package src.com.school.entity;

import java.util.List;

/*
 * school can have many teachers
 * also many students
 * 
 */

public class School 
{
	
	
	private List<Teacher> teachers;
	private List<Student> students;
	
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/*  new school object is created 
	 *@param List of teachers in school
	 * 
	 * @param List of students in school
	 */
	
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
/*
 * @return list of students
 * 
 */
	public List<Student> getStudents() {
		return students;
	}
	
   /*
    * add student to the school
    * @param student to be added
    * 
    */
	public void addStudents(Student student) {
		students.add(student);		
	}
	
	/*
	 * @return the total money earned by schol
	 * 
	 */

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/*add total modeny earned by school
	 * @param moneyearned that is supposed to be added
	 * 
	 */
	
	public void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	/*
	 * @return the total money spent
	 * 
	 */
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/*update the money that is spent by school
	 * @param moneyspent in school as like salary
	 * 
	 */
	public static void  updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}
	
	/*
	 * add teachers
	 */
	public void addTeacher(Teacher teacher)
	{
		teachers.add(teacher);
	}

}
