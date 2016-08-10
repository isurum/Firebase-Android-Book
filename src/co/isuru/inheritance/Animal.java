package co.isuru.inheritance;

public class Animal {
	
		// State is defined in fields. 
		private String name;
		private String color;		
		
		public Animal(String name, String color){
			this.name = name;
			this.color = color;
			
		}
		
		// output animal's state
		protected void outputState(){
			System.out.println("Name of the animal: " + name);
			System.out.println("Color of the animal: " + color);			
		}
}
