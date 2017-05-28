/**
 * Created by xiaoyun on 5/28/17.
 */
public class ConcreteDecoratorA extends Decorator {
    private Component component;

    public ConcreteDecoratorA (Component c) {
        component = c;
    }

    @Override
    public void decoratedMethod() {
        System.out.println("decorate/extend decoratedMethod in concrete decorator A");
        component.decoratedMethod();
    }

}
