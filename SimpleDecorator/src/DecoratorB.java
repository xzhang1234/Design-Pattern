/**
 * Created by xiaoyun on 5/28/17.
 */
public class DecoratorB extends Component{
    private Component component;

    public DecoratorB(Component c) {
        component = c;
    }

    @Override
    public void decoratedMethod() {
        System.out.println("decorate/extend decoratedMethod in decorator B");
        component.decoratedMethod();
    }
}
