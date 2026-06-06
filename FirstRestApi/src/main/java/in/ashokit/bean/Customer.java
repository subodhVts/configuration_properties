package in.ashokit.bean;

public class Customer {

	private Integer id;
	private String name;
	private String country;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	public Customer(Integer id, String name, String country) {
		
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	
	
}
