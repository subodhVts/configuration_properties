package in.ashokit.bean;

public class Employee {
	
	private int eId;
	private String name;
	private String country;
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee(Integer eId, String name, String country) {
		this.eId = eId;
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", country=" + country + "]";
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	
	
	
	
	
	

}
