/**
 * Created by xiaoyun on 7/17/17.
 */
public class Off implements State {
    Light light;

    public Off(Light light) {
        this.light = light;
    }

    @Override
    public void changeState() {
        light.setState(light.getOn());
        System.out.println("I am on now.");
    }
}
