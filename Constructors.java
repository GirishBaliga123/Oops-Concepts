package ContructorConcepts;

//Constructors is used to initialize the class variable .
//Constructors have same name as like class name.
//It doesn't have the return type in turn which doesn't return any value.
//We can create more than one- Constructors by concepts of method overloading.
//Constructors will be called at the time of object/instance creation.

// When we don't give values for the class variable defined , then complier which initialize the default values to the variable as per datatypes.
// like for int = 0, String = null etc..

public class Constructors {

	int i;
	String name;

	public Constructors() {
//		i = 10;
//		name = "John";

		System.out.println("value of i " + i);
		System.out.println("Value of name " + name);

	}

	public static void main(String[] args) {

		Constructors obj = new Constructors();
	}

}
