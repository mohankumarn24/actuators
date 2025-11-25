package net.projectsync.actuators.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "test.employee")
public class EmployeeProperties {
	
	private String id;
	private String firstname;
	private String lastname;
	private String address;

	// getters, setters
	public String getId() { return id; }
	public String getFirstname() { return firstname; }
	public String getLastname() { return lastname; }
	public String getAddress() { return address; }
	
	public void setId(String id) { this.id = id; }
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public void setLastname(String lastname) { this.lastname = lastname; }
	public void setAddress(String address) { this.address = address; }
	
	/*	
	Spring Boot @ConfigurationProperties Case Sensitivity Rules:
	 - Spring matches the property names to fields by converting your field names to relaxed binding names.
	 - Spring Boot uses Relaxed Binding, which means the following are all equivalent
		 test.employee.firstname
		 test.employee.first-name
		 test.employee.first_name
		 test.employee.FIRSTNAME
		 test.employee.FirstName
	 */
}
