/**
 * Created by xiaoyun on 5/29/17.
 */
public class Demo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter imitatedTarget = new Adapter(adaptee);
        imitatedTarget.targetMethod();
    }
}
