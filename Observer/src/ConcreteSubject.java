import java.util.ArrayList;

/**
 * Created by xiaoyun on 5/27/17.
 */
public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;
    private int data;

    public ConcreteSubject () {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    //setObserversData()
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setData(int data) {
        this.data = data;
        notifyObservers();
    }

    @Override
    public int getData() {
        return data;
    }


}
