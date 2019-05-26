package null_object;

public class NullEntity implements AbstractEntity {

    private Exception exception;

    public NullEntity(Exception e) {
        this.exception = e;
    }

    public void doSomething() {

    }
}
