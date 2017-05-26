/**
 * Created by xiaoyun on 5/26/17.
 */
public class SubClass1 extends SuperClassWithFunctionsDifferInSubClass {
    public SubClass1() {
        //Define the strategy for func1 and func2
        iFunc1DifferInSomeSubClass = new Func1Category1();
        iFunc2DifferInSomeSubClass = new Func2Category1();
    }
    @Override
    public void funcDifferInAllSubClass() {
        System.out.println("funcDifferInAllSubClass in SubClass1");
    }
}
