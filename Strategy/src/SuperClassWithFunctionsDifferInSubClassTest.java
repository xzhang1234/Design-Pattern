import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by xiaoyun on 5/26/17.
 */
class SuperClassWithFunctionsDifferInSubClassTest {
    SubClass1 obj1;
    SubClass2 obj2;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        obj1 = new SubClass1();
        obj2 = new SubClass2();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(null);
    }

    @org.junit.jupiter.api.Test
    void funcDifferInAllSubClass() {
        obj1.funcDifferInAllSubClass();
        obj2.funcDifferInAllSubClass();
        assertEquals(outContent.toString(),"funcDifferInAllSubClass in SubClass1\n" +
                "funcDifferInAllSubClass in SubClass2\n");
    }

    @org.junit.jupiter.api.Test
    void func1DifferInSomeSubClass() {
        obj1.func1DifferInSomeSubClass();
        obj2.func1DifferInSomeSubClass();
        assertEquals(outContent.toString(), "func1DifferInSomeSubClass, Category 1\n" +
                "func1DifferInSomeSubClass, Category 2\n");
    }

    @org.junit.jupiter.api.Test
    void func2DifferInSomeSubClass() {
        obj1.func2DifferInSomeSubClass();
        obj2.func2DifferInSomeSubClass();
        assertEquals(outContent.toString(), "func2DifferInSomeSubClass, Category 1\n" +
                "func2DifferInSomeSubClass, Category 1\n");
    }

    @org.junit.jupiter.api.Test
    void funcSameInAllSubClass() {
        obj1.funcSameInAllSubClass();
        obj2.funcSameInAllSubClass();
        assertEquals(outContent.toString(), "funcSameInAllSubClass\n" +
                "funcSameInAllSubClass\n");
    }

}