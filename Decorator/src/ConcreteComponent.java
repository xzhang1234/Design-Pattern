/**
 * Created by xiaoyun on 5/28/17.
 */
public class ConcreteComponent extends Component {
    @Override
    public void decoratedMethod() {
        System.out.println("decorated method in concrete component");
    }
}
