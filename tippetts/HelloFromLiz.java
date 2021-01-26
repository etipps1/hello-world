package tippetts;

public class HelloFromLiz {
    public void sayHello(String name){
        System.out.println("Hello, my name is " +name+".");
    }
    public static void main(String[] args) {
        HelloFromLiz hello = new HelloFromLiz();
        hello.sayHello("Liz");
    }
}
