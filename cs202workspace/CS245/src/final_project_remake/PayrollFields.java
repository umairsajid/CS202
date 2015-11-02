package final_project_remake;

public class PayrollFields {
	private String lastName;
	private String hireDate;
	private String dob;
	private String sex;
	private String jobStatus;
	private String payType;
	private int salary;
	private int yos;
	private int age;
	private int id;
	
	public PayrollFields(String lastName, String hireDate, String dob, String sex, String jobStatus, 
			String payType, int salary, int yos){
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.dob = dob;
		this.sex = sex;
		this.jobStatus = jobStatus;
		this.payType = payType;
		this.salary = salary;
		this.yos = yos;
	}
	public PayrollFields(int id, String lastName, String hireDate, String dob, String sex, String jobStatus, 
			String payType, int salary, int yos){
		this.id = id;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.dob = dob;
		this.sex = sex;
		this.jobStatus = jobStatus;
		this.payType = payType;
		this.salary = salary;
		this.yos = yos;
	}
	public PayrollFields(int id, String lastName, String hireDate, String dob, String sex, String jobStatus, 
			String payType, int salary, int yos, int age){
		this.id = id;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.dob = dob;
		this.sex = sex;
		this.jobStatus = jobStatus;
		this.payType = payType;
		this.salary = salary;
		this.yos = yos;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getYos() {
		return yos;
	}

	public void setYos(int yos) {
		this.yos = yos;
	}
	
	public String toString(){
		return id + "," + lastName+ "," + hireDate+ "," + dob+ "," + sex+ "," + jobStatus+ "," + payType+ "," + salary+ "," + yos;
	}
	
}
