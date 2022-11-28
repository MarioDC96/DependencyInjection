package co.develhope.DependencyInjection.component;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@Component
public class MyComponent {


    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor");
        this.myComponentName = "Mario";
    }

    public String getMyComponentName(){
        final String myComponentImmutableName = this.myComponentName;
        return myComponentImmutableName;
    }
}
