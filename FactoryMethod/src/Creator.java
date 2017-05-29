/**
 * Created by xiaoyun on 5/28/17.
 */
public abstract class Creator {
    public abstract Product factoryMethod();

    public static void main(String[] args) {
        Creator creator1 = new ConcreteCreator1();
        Creator creator2 = new ConcreteCreator2();
        Creator creator3 = new ConcreteCreator3();
        System.out.println(creator1.factoryMethod().getDescription());
        System.out.println(creator2.factoryMethod().getDescription());
        System.out.println(creator3.factoryMethod().getDescription());
    }
}
