package co.isuru.object;

public class Dog { // definition of class Dog
	
	// State is defined in fields. 
	private String name;
	private String color;
	private String breed;
	private boolean isHungry = false;
	
	public Dog(String name, String color, String breed, boolean isHungry){
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.isHungry = isHungry;
	}
	
	// defines dog's behaviour "bark"
	private void bark(){
		System.out.println("Dog barks...");
	}
	
	// output dog's state
	private void outputState(){
		System.out.println("Dog's name: " + name);
		System.out.println("Dog's color: " + color);
		System.out.println("Dog's breed: " + breed);
		if(isHungry == true){
			System.out.println("Dog is hungry. Feed him...");
		}else{
			System.out.println("Dog is not hungry.");
		}
	}

	// main method is the starting point of this simple application.
	public static void main(String[] args) {
		// Creation of the dog object
		Dog dog = new Dog("Max", "White", "Poodle", true);
		// Invoking back() method on the dog object.
		dog.bark();
		// Print dog's state
		dog.outputState();
	}

}
