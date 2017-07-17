/**
 * Created by xiaoyun on 7/17/17.
 */
public class Light {
    State on;
    State off;

    State state;
    public Light() {
        this.on = new On(this);
        this.off = new Off(this);
        this.state = on;
    }

    public void operateSwitch () {
        state.changeState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOn() {
        return on;
    }

    public State getOff() {
        return off;
    }

    public static void main(String[] args) {
        Light light = new Light();
        light.operateSwitch();
        light.operateSwitch();
    }
}



