### Design pattern 
1. Strategy v.s. Decorator  

	Suppose the final object is a person who has different clothes.  

	Decorator is like adding clothes to a human body. The human body in Decorator doesn't know his clothes. No matter how you decorate the body, it is essentially a body, not the decorator.

	Strategy is like a person selects his clothes. Strategy is a person who owns all his clothes. 

2. Decorator  

	To implement decorator, extend and include the super class at the same time. Extend keeps the subclass being a superclass. Include adds more functionality to the superclass.
	
### OO programming:  
1. Ways to extend a class: 

- Extending class inherits extended class  
  - override functions in super class  
  - add new functions  
- Extending class includes extended class  
  - add new functions
- Extending class implements extra interfaces
  



