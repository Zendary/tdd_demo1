package facade;

public class Hello {
    public String sayHello(String name) {
        if(name == null){
            name = "my friend";
        }
        if(name == name.toUpperCase()){
            return "HELLO " + name;
        }
        return "Hello " + name;
    }
    public String sayHello2(String[] name) {
        String greeting = "Hello";

        if (name.length > 1) {
            greeting = "Hello, ";
            for (int i = 0; i < name.length - 1; i++) {
                greeting = greeting + name[i] + ", ";
            }
            greeting = greeting + "and " + name[name.length-1] + ".";
        }


        return greeting;
    }
}
