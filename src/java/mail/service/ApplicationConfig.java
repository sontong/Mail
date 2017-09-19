package mail.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Joe Gregg
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(mail.service.HandleFacadeREST.class);
        resources.add(mail.service.MessageFacadeREST.class);
        resources.add(mail.service.RecipientFacadeREST.class);
        resources.add(mail.service.UserFacadeREST.class);
    }
    
}
