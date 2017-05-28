import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by xiaoyun on 5/28/17.
 */
class ObserverTest {
    Observer observer1;
    Observer observer2;
    Subject subject;

    @BeforeEach
    void setUp() {
        subject = new ConcreteSubject();
        observer1 = new ConcreteObserver(subject);
        observer2 = new ConcreteObserver(subject);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void update() {

    }

    @Test
    void getData() {

    }

    @Test
    void setSubjectData() {
        int oldData = observer1.getData();
        observer1.setSubjectData(oldData + 1);
        assertEquals(observer1.getData(), oldData + 1);
        assertEquals(observer2.getData(), oldData + 1);
    }

}