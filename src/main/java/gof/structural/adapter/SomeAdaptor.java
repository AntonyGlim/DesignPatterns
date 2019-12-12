package gof.structural.adapter;

public class SomeAdaptor implements SomeInterface2 {

    SomeInterface1 someInterface1;

    public SomeAdaptor(SomeInterface1 someInterface1) {
        this.someInterface1 = someInterface1;
    }

    public void doSomething2() {
        someInterface1.doSomething1();
    }
}
