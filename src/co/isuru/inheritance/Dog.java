package co.isuru.inheritance;

public class Dog extends Animal {

	public Dog(String name, String color) {
		super(name, color);		
	}

	// defines dog's behaviour "bark"
	private void bark() {
		System.out.println("Dog barks...");
	}
	
	public static void main(String args[]){
		Dog dog = new Dog("Max", "Black");
		dog.outputState();
		// make dog bark
		dog.bark();
	}

}
