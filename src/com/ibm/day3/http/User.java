package com.ibm.day3.http;

public class User {

	private int id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;

	// Getters and Setters for each field

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	// (Optional) Override toString() method for a user-friendly representation of
	// the object
	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name='" + name + '\'' + ", username='" + username + '\'' + ", email='" + email
				+ '\'' + ", address=" + address + ", phone='" + phone + '\'' + ", website='" + website + '\''
				+ ", company=" + company + '}';
	}
}

// Create a separate class for the Address within the User
class Address {
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private Geo geo;

	// Getters and Setters for each field (similar to User class)

	// ... (Define getters and setters for address fields)
}

// Create a separate class for the Company within the User
class Company {
	private String name;
	private String catchPhrase;
	private String bs;

	// Getters and Setters for each field (similar to User class)

	// ... (Define getters and setters for company fields)
}

class Geo {
	private double lat;
	private double lng;

	// Getters and Setters for lat and lng
	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}
}