package entity;


public class customer {
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public customer() {
	}
	public customer(String name, String gender, String dateOfbirth, String department) {
		this.name = name;
		this.gender = gender;
		this.dateOfbirth = dateOfbirth;
		this.department = department;
	}
	private String name;
	private String gender;
	private String dateOfbirth;
	private String department;
}
