package src.com.school.entity;


/*
 * Created by Sandhya 8/3/2017
 * this class is responsible to keep the track 
 * of student fees,name,grade and fees paid
 * 
 */
public class Student
{
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/*'
	 * constructor is to initialze
	 * @param id  --studentid
	 * 
	 */
	
	public Student(int id, String name, int grade, int feesPaid) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 30000;
	}

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	

	public void payFees(int fees)
	{
		feesPaid+=fees;
		School.updateTotalMoneySpent(feesPaid);
		
	}

	public int getRemainingFees()
	{
		return feesTotal-feesPaid;
	}
	
	
	

}
