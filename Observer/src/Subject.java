/**
 * Created by xiaoyun on 5/27/17.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    public void setData(int data);
    public int getData();
}
