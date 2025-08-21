package net.projectsync.actuators.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class EmployeePropertiesIndividual {

    @Value("${test.employee.id}")
    private String id;
    
    @Value("${test.employee.firstname}")
    private String firstName;
    
    @Value("${test.employee.lastname}")
    private String lastName;
    
    @Value("${test.employee.address}")
    private String address;

    @Bean
    String employeeId() {
    	return id;
    }

    @Bean
    String firstName() {
    	return firstName;
    }
    
    @Bean
     String lastName() {
    	return lastName;
    }
    
    @Bean
    String address() {
    	return address;
    }
}

