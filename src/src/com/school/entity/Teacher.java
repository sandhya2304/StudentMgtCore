package src.com.school.entity;

public class Teacher 
{
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Teacher(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned=0;
	}
	
	/*
	 * Adds to the salaryearned 
	 * Remove total money earned by the school
	 * @param salary
	 */
	public void receiveSalary(int salary)
	{
		
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
		
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned + "]";
	}
	
	
	

}
