
public class Zoo {
//main method will go here
// this class will house the instances of Animal
	
	public static void main(String[] args) {
		
		
		Animal animal1 = new Animal("Lion", 5, 250, "Tan");
		Animal animal2 = new Animal("Wolf", 7, 175, "Gray");
		Animal animal3 = new Animal("Bear", 10, 700, "Brown");
		Animal animal4 = new Animal("Gorilla", 6, 375, "Black");

		animal1.call();
		animal1.eat();
		animal1.walk();


		animal2.call();
		animal2.eat();
		animal2.walk();


		animal3.call();
		animal3.eat();
		animal3.walk();


		animal4.call();
		animal4.eat();
		animal4.walk();



	}
}
