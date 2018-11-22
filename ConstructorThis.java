package ContructorConcepts;

// this is an keyword used in constructors 
// its used to initialized the class variable with the method parameter 
// Sometimes programmer don't want to change the original names for there understanding purpose , so that with the help of this keyword we can 
   // keep there variable name without disturbing.

public class ConstructorThis {

	// class variables
	int id;
	String name;    
		
	public ConstructorThis(int id, String name)  // method parameter
	{
   		this.name=name;
   		this.id=id;
   		
   		System.out.println("Value of ID ="+id);
   		System.out.println("value of name ="+name);
	}
	
	public static void main(String[] args) {
		
		ConstructorThis obj1 = new ConstructorThis(20, "Girish");
		ConstructorThis obj2 = new ConstructorThis(21, "Tom");
		ConstructorThis obj3 = new ConstructorThis(22, "Jhon");
		ConstructorThis obj4 = new ConstructorThis(23, "harry");

	}

}
