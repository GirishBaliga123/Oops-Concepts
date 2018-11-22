package ContructorConcepts;

// Constructors is used to initialize the class variable .
// Constructors have same name as like class name.
// It doesn't have the return type in turn which doesn't return any value.
// We can create more than one- Constructors by concepts of method overloading.
// Constructors will be called at the time of object/instance creation.


public class ConstructorOverloading {
	
	public ConstructorOverloading()
	{
		System.out.println("Default-const");
	}
	
	public ConstructorOverloading(int i)
	{
		System.out.println("one parameter const and value is "+i);
	}
	
	public ConstructorOverloading(int i,String s)
	{
		System.out.println("two parameter const and value is "+i +","+s);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading(10);
		ConstructorOverloading obj2 = new ConstructorOverloading(20,"Test");

	}

}
