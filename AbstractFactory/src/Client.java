/**
 * Created by xiaoyun on 5/29/17.
 */
public class Client {
    AbstractFactory factory;
    AbstractProductA productA;
    AbstractProductB productB;
    public Client(AbstractFactory f) {
        this.factory = f;
    }
    public AbstractProductA getProductA() {
        return factory.createProductA();
    }
    public AbstractProductB getProductB() {
        return factory.createProductB();
    }

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        Client client = new Client(factory);
        System.out.println(client.getProductA().getClass().getName());
        System.out.println(client.getProductB().getClass().getName());
    }
}
