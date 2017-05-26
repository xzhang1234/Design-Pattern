import com.sun.javafx.scene.control.behavior.BehaviorBase;

/**
 * Created by xiaoyun on 5/26/17.
 */
public abstract class SuperClassWithFunctionsDifferInSubClass {
    Func1DifferInSomeSubClass iFunc1DifferInSomeSubClass;
    Func2DifferInSomeSubClass iFunc2DifferInSomeSubClass;

    //If a function is different for each subclass, we simply overwrite it.
    public abstract void funcDifferInAllSubClass();

    //This function has several categories of behaviors for subclasses.
    public void func1DifferInSomeSubClass () {
        iFunc1DifferInSomeSubClass.run();
    }

    public void func2DifferInSomeSubClass () {
        iFunc2DifferInSomeSubClass.run();
    }

    //This function is the same for all subclasses.
    public void funcSameInAllSubClass() {
        System.out.println("funcSameInAllSubClass");
    }
}
