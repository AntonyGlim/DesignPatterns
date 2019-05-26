package null_object;

public class NullObjectPatternExample {

    private AbstractEntity entity;

    public NullObjectPatternExample() {
        try {
            this.entity = new RealEntity();
        } catch (Exception e){
            this.entity = new NullEntity(e);
        }
    }
}
