### Design pattern  
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
4. Strategy  
- Intent:  
-- Realize different behavior of objects, utilize different strategies
-- Change objects' behaviors or strategies on runtime  
- Implementation:  
-- Delegation  
-- To realize different strategies/behaviors of objects, the object can include an interface of the behavior, and choose different implementations of the interface to realize different the behaviors.  
5. Command  
- Intent:  
-- Decouple the command requester (sender) and command executor(receiver)  
- Implementation:  
-- Combine receiver and operation as a command, and only expose execute()  
https://stackoverflow.com/questions/3883692/using-a-strategy-pattern-and-a-command-pattern?rq=1  
6. Template Method  
- Intent:  
-- Define the backbone procedure of a method  
- Implementation:  
-- Polymophorism  
7. Observer  


8. State  
- Intent:  
-- A perfect way to realize state machine  
-- Same interface of operation regardless of the inner state of the object  
- Implementation:  
-- Wrap each state as an object  
-- Delegate operation to individual state  
9. Iterator  
- Intent:  
-- iterate a collection of objects without knowing the implmentation of collection  
- Implementation:  
-- define iteration control variable as object fields  
-- hasNext(), boundary check  
-- next(), return current object, and then increment control variable  

#### Structure:  
10. Composite  
- Intent:  
-- Group objects  
- Implementation:  
-- Include a list of selfies in class definition  
11. Decorator  
12. Facade
13. Adapter  
- Intent:  
-- Convert interface of a class to another  
- Implementation:  
-- Adapter implements the target interface (so the adapter is an instance of the interface) while delegates the function call to the adaptee
14. Proxy  

Reference:  
1. Head First Design Pattern
2. https://www.tutorialspoint.com/design_pattern  
3. GoF, Design Patterns: Elements of Reusable Object-Oriented Software  
4. Stack overflow:  
https://stackoverflow.com/questions/616796/what-is-the-difference-between-factory-and-strategy-patterns
https://stackoverflow.com/questions/1001767/what-is-the-basic-difference-between-the-factory-and-abstract-factory-patterns?rq=1 
