### Design pattern 
1. Strategy  
- Intent:  
-- Realize different behavior of objects, utilize different strategies
-- Change objects' behaviors or strategies on runtime  
- Implementation:  
-- Delegation  
-- To realize different strategies/behaviors of objects, the object can include an interface of the behavior, and choose different implementations of the interface to realize different the behaviors. 
2. Factory Method  
- Intent:  
-- Eliminate the dependency on the implementation in subclass by defering initialization to subclass  
- Implementation:  
-- Inheritance  
-- The class which needs "object" creates an abstract factory method, its subclasses override the abstract factory method to return concrete "object".
3. Abstract Factory  
- Intent:  
-- Create a group related objects  
- Implementation:  
-- Composition and delegation  
-- Client composes an abstract factory, and delegate the object creation to concrete factory.  
-- For each object, abstract factory, concrete factory is the pattern of factory method.  
https://stackoverflow.com/questions/616796/what-is-the-difference-between-factory-and-strategy-patterns
https://stackoverflow.com/questions/1001767/what-is-the-basic-difference-between-the-factory-and-abstract-factory-patterns?rq=1  
4. Command  
- Intent:  
-- Decouple the command requester (sender) and command executor(receiver)  
- Implementation:  
-- Combine receiver and operation as a command, and only expose execute()  
https://stackoverflow.com/questions/3883692/using-a-strategy-pattern-and-a-command-pattern?rq=1


1. Strategy v.s. Decorator  

	Suppose the final object is a person who has different clothes.  

	Decorator is like adding clothes to a human body. The human body in Decorator doesn't know his clothes. No matter how you decorate the body, it is essentially a body, not the decorator.

	Strategy is like a person selects his clothes. Strategy is a person who owns all his clothes.  
	
2. Strategy  

	To implement strategy, first implement an interface for the different strategy, then include the interface in the abstract object, choose an implementation of the interface when implementing the concrete object.  

3. Decorator  

	To implement decorator, extend and include the super class at the same time. Extend keeps the subclass being a superclass. Include adds more functionality to the superclass.  

4. Factory Method == Virtual Constructor
	
	Since there is no virtual constructor, we use another method to imitate the constructor. The imitating constructor is essentially polymorphism.

5. Abstract Factory vs. Factory Method

	https://stackoverflow.com/questions/5739611/differences-between-abstract-factory-pattern-and-factory-method

6. Command  
	Create Command class with receiver, Invoker calls the execute() in Command, Application coordinates commands and invokers.
	
7. Adaptor && Facade  
	Easy implementation with composition

8. Template method  
	Template method is similar to factory method. Factory method delays the object creation to subclasses, Template method delays the implementation of method to subclasses. They all utilize polymorphism.  
	
### OO programming:  
1. Ways to extend a class: 

	- Extending class inherits extended class  
  		- override functions in super class  
  		- add new functions  
	- Extending class includes extended class  
  		- add new functions
	- Extending class implements extra interfaces




