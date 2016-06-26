package biz.r2s.util.Service;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;


public class AppConfig {
    /**
     * Google's UserService is part of a jar, so we cannot use
     * Spring's "component scanning".  Thus, we explicitly
     * declare it as a bean for DI.
     */

    public UserService userService() {
        return UserServiceFactory.getUserService();
    }
}
