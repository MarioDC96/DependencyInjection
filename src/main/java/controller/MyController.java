package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.MyService;

@Controller
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(){
        System.out.println("MyController constructor");
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyService.getName() has been called");
        return myService.getName();
    }

    @GetMapping
    public void welcomeMessage(){
        System.out.println("Benvenuto");
    }
}
