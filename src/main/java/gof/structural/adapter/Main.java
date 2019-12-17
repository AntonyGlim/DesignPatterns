package gof.structural.adapter;

public class Main {
    public static void main(String[] args) {
        SomeInterface1 object1 = new SomeObject1();
        SomeInterface2 object2 = new SomeAdaptor(object1);
        object2.doSomething2();
    }
}
