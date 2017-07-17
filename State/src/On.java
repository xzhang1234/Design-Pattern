/**
 * Created by xiaoyun on 7/17/17.
 */
public class On implements State {
    Light light;

    public On(Light light) {
        this.light = light;
    }

    @Override
    public void changeState() {
        light.setState(light.getOff());
        System.out.println("I am off now.");
    }
}
