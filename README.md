### Design Pattern  
#### Creation:  
1. Singleton  
- Intent:  
-- Single instance  
- Implementation:  
-- Private constructor  
-- Static instance and getInstance method  
2. Factory Method  
- Intent:  
-- Defer instantiation to subclass, eliminate the dependency on specific subclasses  
- Implementation:  
-- Inheritance  
-- The class which needs/uses "object" (Creator) creates an abstract factory method, its subclasses override the abstract factory method and return concrete "object".
3. Abstract Factory  
- Intent:  
-- Create a group of related objects  
- Implementation:  
-- Composition and delegation  
-- Client contains a reference of a concrete factory, and delegate the objects creation to concrete factory.  
-- From each object creation, the abstract factory and concrete factory follow the pattern of factory method.  
4. Builder (To do)  
5. Prototype (To do)  

#### Behavior:  
6. Strategy  
- Intent:  
-- Realize different behavior of objects, utilize different strategies
-- Change objects' behaviors or strategies on runtime  
- Implementation:  
-- Delegation  
-- To realize different strategies/behaviors of objects, the object can include an interface of the behavior, and choose different implementations of the interface to realize different the behaviors.  
7. Command  
- Intent:  
-- Decouple the command requester (sender) and command executor(receiver)  
- Implementation:  
-- Combine receiver and operation as a command, and only expose execute()  
https://stackoverflow.com/questions/3883692/using-a-strategy-pattern-and-a-command-pattern?rq=1  
8. Template Method  
- Intent:  
-- Define the backbone procedure of a method  
- Implementation:  
-- Polymophorism  
9. Observer  
10. State  
- Intent:  
-- A perfect way to realize state machine  
-- Same interface of operation regardless of the inner state of the object  
- Implementation:  
-- Wrap each state as an object  
-- Delegate operation to individual state  
11. Iterator  
- Intent:  
-- iterate a collection of objects without knowing the implmentation of collection  
- Implementation:  
-- define iteration control variable as object fields  
-- hasNext(), boundary check  
-- next(), return current object, and then increment control variable  
12. Chain of responsibility (To do)  
13. Interpreter (To do)  
14. Mediator (To do)  
15. Memento (To do)  
16. Visitor (To do)  

#### Structure:  
17. Composite  
- Intent:  
-- Group objects in tree structure  
- Implementation:  
-- Include a list of selfies in class definition  
18. Decorator  
- Intent:  
-- Extends functionality with composition  
- Implementation:  
-- Decorator extends and contains the decorated component at the same time.  
-- "Extend" makes sure the decorator is still an instance of the decorated component class, and can be further decorated.    
-- "Contain" makes delegation possible.  
19. Facade  
- Intent:  
-- Define and expose an easier interface and hence hide the complicated inner class call
- Implementation:  
-- Composition  
20. Adapter  
- Intent:  
-- Convert interface of a class to another  
- Implementation:  
-- Adapter implements the target interface (so the adapter is an instance of the interface) while delegates the function call to the adaptee
21. Proxy  
- Intent:  
-- Provide a barrier between client and the real object, and hence can (1) control access, (2) add extra functionality. The proxy can also serve as a placeholder for the real object and initialize the real object on demand.  
- Implementation:  
- Composition and delegation  
22. Bridge (To do)  
23. FlyWeight (To do)  

#### Reference:  
1. Head First Design Pattern
2. https://www.tutorialspoint.com/design_pattern  
3. GoF, Design Patterns: Elements of Reusable Object-Oriented Software  
4. Stack overflow:  
https://stackoverflow.com/questions/616796/what-is-the-difference-between-factory-and-strategy-patterns
https://stackoverflow.com/questions/1001767/what-is-the-basic-difference-between-the-factory-and-abstract-factory-patterns?rq=1 
