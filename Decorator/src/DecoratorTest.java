import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by xiaoyun on 5/28/17.
 */
class DecoratorTest {
    Component component;
    Decorator decoratorA;
    Decorator decoratorB;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        component = new ConcreteComponent();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(null);
    }

    @org.junit.jupiter.api.Test
    void decoratedMethod() {
        decoratorA = new ConcreteDecoratorA(component);
        decoratorA = new ConcreteDecoratorA(decoratorA);
        decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorA = new ConcreteDecoratorA(decoratorB);
        decoratorA.decoratedMethod();
        assertEquals(outContent.toString(),
                "decorate/extend decoratedMethod in concrete decorator A\n" +
                "decorate/extend decoratedMethod in concrete decorator B\n" +
                "decorate/extend decoratedMethod in concrete decorator A\n" +
                "decorate/extend decoratedMethod in concrete decorator A\n" +
                "decorated method in concrete component\n"
        );
    }

}