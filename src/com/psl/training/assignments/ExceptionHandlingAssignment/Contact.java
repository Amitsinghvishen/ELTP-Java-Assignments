package com.psl.training.assignments.ExceptionHandlingAssignment;



public class Contact {

	private String firstName="";
	private String middleName="";
	private String lastName="";
	private String dob="";
	private String gender="";
	private String anniversary;
	private String address;
	private String area;
	private String city;
	private int pincode;
	private String State;
	private String country;
	private long telephoneNumber=0;
	private long mobileNumber=0;
	private String email;
	private String website;
	
	public Contact(String firstName,String middleName,String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleName(middleName);
	}
	public Contact(String firstName,String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	public void validate() throws Exception{
		Validate.validateName(firstName, lastName);
		Validate.validateDOB(dob);
		Validate.validateNumber(telephoneNumber, mobileNumber);
		Validate.validateEmail(email);
	
		
	}
	
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dob="
				+ dob + ", gender=" + gender + ", anniversary=" + anniversary + ", address=" + address + ", area="
				+ area + ", city=" + city + ", pincode=" + pincode + ", State=" + State + ", country=" + country
				+ ", telephoneNumber=" + telephoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", website=" + website + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob=dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAnniversary() {
		return anniversary;
	}
	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
}
