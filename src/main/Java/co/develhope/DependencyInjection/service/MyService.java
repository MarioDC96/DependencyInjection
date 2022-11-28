package co.develhope.DependencyInjection.service;
import co.develhope.DependencyInjection.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {


    private MyComponent mycomponent;

    @Autowired
    public MyService(MyComponent component){
        System.out.println("MyService constuctor");
        this.mycomponent = component;
    }

    public String getName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return mycomponent.getMyComponentName();
    }
}
