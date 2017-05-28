import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by xiaoyun on 5/28/17.
 */
class DecoratorTest {
    Component component;
    Component decoratorA;
    Component decoratorB;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        component = new Component();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(null);
    }

    @org.junit.jupiter.api.Test
    void decoratedMethod() {
        decoratorA = new DecoratorA(component);
        decoratorA = new DecoratorA(decoratorA);
        decoratorB = new DecoratorB(decoratorA);
        decoratorA = new DecoratorA(decoratorB);
        decoratorA.decoratedMethod();
        assertEquals(outContent.toString(),
                "decorate/extend decoratedMethod in decorator A\n" +
                "decorate/extend decoratedMethod in decorator B\n" +
                "decorate/extend decoratedMethod in decorator A\n" +
                "decorate/extend decoratedMethod in decorator A\n" +
                "decorated method in component\n"
        );
    }

}