package py.softcr.service;

import javax.faces.bean.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String generateGreeting(String name){
        return "Hi "+name;
    }
}
