/**
 * Created by xiaoyun on 5/28/17.
 */
public class ConcreteCreator1 extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
