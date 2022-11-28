package component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(String myName){
        System.out.println("MyComponent constructor");
        this.myComponentName = myName;
    }

    public String getMyComponentName(){
        String myComponentImmutableName = this.myComponentName;
        return myComponentImmutableName;
    }
}
