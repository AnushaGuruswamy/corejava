package co.Anusha.gun.dto;

public class CompanyDTO {
	private String companyName;
	private String country;
	private String founder;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	@Override
	public String toString() {
		return "class name : "+getClass().getSimpleName() +"\n"+ "companyName=" + companyName +"\n"+ "country=" + country +"\n"+ "founder=" + founder;
	}
	
}
