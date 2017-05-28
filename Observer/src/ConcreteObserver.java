/**
 * Created by xiaoyun on 5/27/17.
 */
public class ConcreteObserver implements Observer {
    private Subject subject;
    private int data;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    //setData
    @Override
    public void update() {
        this.data = subject.getData();
    }

    @Override
    public int getData() {
        return data;
    }

    @Override
    public void setSubjectData(int data) {
        subject.setData(data);
    }

}
