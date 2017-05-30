/**
 * Created by xiaoyun on 5/29/17.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }
}
