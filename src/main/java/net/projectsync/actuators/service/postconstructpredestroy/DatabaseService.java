package net.projectsync.actuators.service.postconstructpredestroy;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class DatabaseService {

    private boolean connectionOpen = false;

    public DatabaseService() {
        System.out.println("1 - DatabaseService constructor");
    }

    @PostConstruct
    public void openConnection() {
        System.out.println("2 - @PostConstruct - Opening database connection");
        // Simulate opening a database connection
        connectionOpen = true;
        System.out.println("    Database connection established");
    }

    public void performDatabaseOperation() {
        if (!connectionOpen) {
            throw new IllegalStateException("Database connection not available");
        }
        System.out.println("Performing database operation...");
    }

    // Stop the application to test this method or press Ctrl+C
    @PreDestroy
    public void closeConnection() {
        System.out.println("3. @PreDestroy - Closing database connection");
        // Simulate closing the database connection
        connectionOpen = false;
        System.out.println("    Database connection closed");
    }
}

/*
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
[32m :: Spring Boot :: [39m              [2m (v2.7.5)[0;39m

[2m2025-09-10 11:48:19.149[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mn.p.actuators.ActuatorsApplication      [0;39m [2m:[0;39m Starting ActuatorsApplication using Java 17.0.7 on home-desktop with PID 6280 (D:\dev\github\actuators\target\classes started by Mohan in D:\dev\github\actuators)
[2m2025-09-10 11:48:19.152[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mn.p.actuators.ActuatorsApplication      [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2025-09-10 11:48:19.950[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port(s): 8080 (http)
[2m2025-09-10 11:48:19.959[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2025-09-10 11:48:19.959[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36morg.apache.catalina.core.StandardEngine [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/9.0.68]
[2m2025-09-10 11:48:20.038[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2025-09-10 11:48:20.038[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 852 ms
1 - DatabaseService constructor
2 - @PostConstruct - Opening database connection
    Database connection established
[2m2025-09-10 11:48:20.521[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.a.e.web.EndpointLinksResolver     [0;39m [2m:[0;39m Exposing 14 endpoint(s) beneath base path '/management'
[2m2025-09-10 11:48:20.530[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.s.web.DefaultSecurityFilterChain    [0;39m [2m:[0;39m Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@13866329, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@2eda2062, org.springframework.security.web.context.SecurityContextPersistenceFilter@25a1a012, org.springframework.security.web.header.HeaderWriterFilter@4b325930, org.springframework.web.filter.CorsFilter@1a9ec80e, org.springframework.security.web.csrf.CsrfFilter@71560f51, org.springframework.security.web.authentication.logout.LogoutFilter@6d963d70, org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter@110e9982, org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter@678a9516, org.springframework.security.web.authentication.ui.DefaultLogoutPageGeneratingFilter@7fd4e815, org.springframework.security.web.authentication.www.BasicAuthenticationFilter@1625789b, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@4525e9e8, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@443a53df, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@5f6b53ed, org.springframework.security.web.session.SessionManagementFilter@79ba0a6f, org.springframework.security.web.access.ExceptionTranslationFilter@5e002356, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@1f84327b]
[2m2025-09-10 11:48:20.577[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port(s): 8080 (http) with context path ''
[2m2025-09-10 11:48:20.588[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[           main][0;39m [36mn.p.actuators.ActuatorsApplication      [0;39m [2m:[0;39m Started ActuatorsApplication in 1.693 seconds (JVM running for 2.216)
[2m2025-09-10 11:48:21.088[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[on(4)-127.0.0.1][0;39m [36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2025-09-10 11:48:21.089[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[on(4)-127.0.0.1][0;39m [36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2025-09-10 11:48:21.089[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[on(4)-127.0.0.1][0;39m [36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 0 ms
[2m2025-09-10 11:48:56.950[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[on(6)-127.0.0.1][0;39m [36minMXBeanRegistrar$SpringApplicationAdmin[0;39m [2m:[0;39m Application shutdown requested.
[2m2025-09-10 11:48:56.967[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[on(6)-127.0.0.1][0;39m [36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Stopping service [Tomcat]
[2m2025-09-10 11:48:56.968[0;39m [32m INFO[0;39m [35m6280[0;39m [2m---[0;39m [2m[on(6)-127.0.0.1][0;39m [36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Destroying Spring FrameworkServlet 'dispatcherServlet'
3. @PreDestroy - Closing database connection
   Database connection closed
*/











/* 
 * I can initialize in constructor itself. then why do i need @PostConstruct?
 */
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

// Example 1: Dependency Injection Issue
@Service
public class UserService {
    
    @Autowired
    private EmailService emailService; // This is NULL in constructor!
    
    @Autowired
    private DatabaseService databaseService; // This is also NULL in constructor!
    
    public UserService() {
        System.out.println("Constructor: emailService = " + emailService); // NULL!
        System.out.println("Constructor: databaseService = " + databaseService); // NULL!
        
        // This will throw NullPointerException!
        // emailService.sendWelcomeEmail(); // DON'T DO THIS!
    }
    
    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: emailService = " + emailService); // NOT NULL!
        System.out.println("PostConstruct: databaseService = " + databaseService); // NOT NULL!
        
        // Now it's safe to use injected dependencies
        emailService.sendWelcomeEmail("System started!");
        databaseService.performDatabaseOperation();
    }
}

// Example 2: Proxy and AOP Issues
@Service
public class SecurityService {
    
    private boolean initialized = false;
    
    public SecurityService() {
        // This method call might not go through Spring proxies!
        loadSecurityConfig(); // Might not trigger @Transactional, @Cacheable, etc.
    }
    
    @PostConstruct 
    public void init() {
        // This method call goes through Spring proxies
        loadSecurityConfig(); // Will properly trigger @Transactional, @Cacheable, etc.
    }
    
    @Transactional
    @Cacheable("security-config")
    public void loadSecurityConfig() {
        System.out.println("Loading security configuration...");
        // Database operations that need transaction
        initialized = true;
    }
}

// Example 3: Exception Handling
@Service
public class FileService {
    
    private String configPath;
    
    public FileService() {
        try {
            // If this fails, Spring won't know about it properly
            loadConfiguration();
            System.out.println("Constructor initialization successful");
        } catch (Exception e) {
            System.out.println("Constructor failed: " + e.getMessage());
            // Spring might still create the bean in an invalid state!
        }
    }
    
    @PostConstruct
    public void init() {
        try {
            loadConfiguration();
            System.out.println("PostConstruct initialization successful");
        } catch (Exception e) {
            System.out.println("PostConstruct failed: " + e.getMessage());
            // Spring handles this better and can prevent bean creation
            throw e;
        }
    }
    
    private void loadConfiguration() throws Exception {
        // Simulate configuration loading that might fail
        configPath = "/app/config.properties";
        if (Math.random() > 0.5) {
            throw new RuntimeException("Configuration file not found");
        }
    }
}

// Example 4: Circular Dependencies
@Service
public class OrderService {
    
    @Autowired
    private PaymentService paymentService;
    
    private boolean ready = false;
    
    public OrderService() {
        // Can't use paymentService here - might cause circular dependency issues
        System.out.println("OrderService constructor - paymentService = " + paymentService);
    }
    
    @PostConstruct
    public void init() {
        // Safe to use here - Spring has resolved circular dependencies
        System.out.println("OrderService init - paymentService = " + paymentService);
        paymentService.validateConfiguration();
        ready = true;
    }
    
    public void processOrder() {
        if (!ready) {
            throw new IllegalStateException("Service not ready");
        }
        paymentService.processPayment();
    }
}

@Service
public class PaymentService {
    
    @Autowired
    private OrderService orderService; // Circular dependency
    
    public PaymentService() {
        System.out.println("PaymentService constructor");
    }
    
    @PostConstruct
    public void init() {
        System.out.println("PaymentService init");
    }
    
    public void validateConfiguration() {
        System.out.println("Payment configuration validated");
    }
    
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}

// Supporting services
@Service
public class EmailService {
    
    public void sendWelcomeEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

@Service
public class DatabaseService {
    
    public void performDatabaseOperation() {
        System.out.println("Performing database operation");
    }
}

// Main Application
@SpringBootApplication
public class DemoApplication {
    
    public static void main(String[] args) {
        System.out.println("=== Spring Boot Lifecycle Demo ===\n");
        
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        
        System.out.println("\n=== Using the services ===");
        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);
        
        orderService.processOrder();
    }
}
*/





/*
When to Use Each?
 - Use Constructor for:
	-- Simple field initialization
	-- Setting final fields
	-- Basic validation that doesn't need dependencies

 - Use @PostConstruct for:
	-- Initialization that needs injected dependencies
	-- Database connections, external service calls
	-- Complex initialization logic
	-- Anything that might throw exceptions
	-- Loading configuration or cached data
	-- Starting background processes


// Real-World Example:
@Service
public class CacheService {
    
    @Autowired
    private RedisTemplate redisTemplate; // NULL in constructor
    
    @Value("${cache.expiry.minutes}")
    private int expiryMinutes; // NULL in constructor
    
    private final Map<String, Object> localCache; // Can initialize in constructor
    
    public CacheService() {
        // Only initialize things that don't need Spring dependencies
        localCache = new ConcurrentHashMap<>();
        System.out.println("Cache service created");
    }
    
    @PostConstruct
    public void setupCache() {
        // Now we can safely use injected dependencies
        redisTemplate.getConnectionFactory().getConnection().ping();
        System.out.println("Redis connection verified");
        System.out.println("Cache expiry set to: " + expiryMinutes + " minutes");
    }
}
*/