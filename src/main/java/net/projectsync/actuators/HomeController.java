package net.projectsync.actuators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.projectsync.actuators.config.EmployeeProperties;

@RestController
public class HomeController {
	
    @Value("${test.employee.id}")
    private String employeeId;
    
    // primitive data types is not supported
    @Autowired
    private String firstName;
    
    @Autowired
    private Environment env; // not sure if @PropertySource("classpath:application.properties") is needed
    
    @Autowired
    private EmployeeProperties employeeProperties;

	@GetMapping
	public String welcome() {
				
    	System.out.println(employeeId);
    	System.out.println(firstName);
    	System.out.println(employeeProperties.getLastname());
    	System.out.println(env.getProperty("test.employee.address"));
    	
		return "hello " + employeeProperties.getFirstname();
	}
}
