/**
 * Created by xiaoyun on 5/28/17.
 */
public class ConcreteDecoratorB extends Decorator {
    private Component component;

    public ConcreteDecoratorB(Component c) {
        component = c;
    }

    @Override
    public void decoratedMethod() {
        System.out.println("decorate/extend decoratedMethod in concrete decorator B");
        component.decoratedMethod();
    }
}
