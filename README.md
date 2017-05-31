### Design pattern 
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




