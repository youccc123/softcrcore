package py.softcr.controller;

import jakarta.annotation.ManagedBean;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import py.softcr.service.GreetingService;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class FormBean {


    private GreetingService greetingService;
    private String name;

    public FormBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreetings(){
        return greetingService.generateGreeting(name);
    }

}
