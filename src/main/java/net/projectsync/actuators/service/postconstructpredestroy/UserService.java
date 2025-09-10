package net.projectsync.actuators.service.postconstructpredestroy;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<String> users;
    private boolean isInitialized = false;

    // Constructor
    public UserService() {
        System.out.println("1. Constructor called - UserService created");
        users = new ArrayList<>();
    }

    // Called AFTER dependency injection is complete
    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct - Initializing UserService");

        // Perform initialization tasks
        users.add("John Doe");
        users.add("Jane Smith");
        isInitialized = true;

        System.out.println("   UserService initialized with " + users.size() + " users");
    }

    // Business method
    public List<String> getAllUsers() {
        if (!isInitialized) {
            throw new IllegalStateException("Service not initialized");
        }
        return new ArrayList<>(users);
    }

    public void addUser(String user) {
        if (!isInitialized) {
            throw new IllegalStateException("Service not initialized");
        }
        users.add(user);
        System.out.println("Added user: " + user);
    }

    // Called BEFORE the bean is destroyed
    // Stop the application to test this method or press Ctrl+C
    @PreDestroy
    public void cleanup() {
        System.out.println("3. @PreDestroy - Cleaning up UserService");

        // Perform cleanup tasks
        if (users != null) {
            System.out.println("   Clearing " + users.size() + " users");
            users.clear();
        }

        isInitialized = false;
        System.out.println("   UserService cleanup completed");
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
1. Constructor called - UserService created
2. @PostConstruct - Initializing UserService
   UserService initialized with 2 users
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
3. @PreDestroy - Cleaning up UserService
   Clearing 2 users
   UserService cleanup completed
*/