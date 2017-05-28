import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by xiaoyun on 5/28/17.
 */
class SubjectTest {
    Subject subject;
    Observer observer1;
    Observer observer2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        subject = new ConcreteSubject();
        observer1 = new ConcreteObserver(subject);
        observer2 = new ConcreteObserver(subject);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void registerObserver() {

    }

    @org.junit.jupiter.api.Test
    void removeObserver() {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        subject.removeObserver(observer1);
        subject.setData(1);
        assertEquals(0, observer1.getData());
        assertEquals(1, observer2.getData());
    }

    @org.junit.jupiter.api.Test
    void notifyObservers() {


    }

    @org.junit.jupiter.api.Test
    void setData() {
        subject.setData(1);
        assertEquals(1, subject.getData());
        assertEquals(1, observer1.getData());
        assertEquals(1, observer2.getData());
    }

    @org.junit.jupiter.api.Test
    void getData() {
        Subject subject = new ConcreteSubject();
        assertEquals(0, subject.getData());
    }

}