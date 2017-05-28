/**
 * Created by xiaoyun on 5/28/17.
 */
public class DecoratorA extends Component {
    private Component component;

    public DecoratorA (Component c) {
        component = c;
    }

    @Override
    public void decoratedMethod() {
        System.out.println("decorate/extend decoratedMethod in decorator A");
        component.decoratedMethod();
    }

}
