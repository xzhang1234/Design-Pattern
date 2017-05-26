/**
 * Created by xiaoyun on 5/26/17.
 */
public class SubClass2 extends SuperClassWithFunctionsDifferInSubClass {
    public SubClass2() {
        //Define the strategy for func1 and func2
        iFunc1DifferInSomeSubClass = new Func1Category2();
        iFunc2DifferInSomeSubClass = new Func2Category1();
    }
    @Override
    public void funcDifferInAllSubClass() {
        System.out.println("funcDifferInAllSubClass in SubClass2");
    }
}
