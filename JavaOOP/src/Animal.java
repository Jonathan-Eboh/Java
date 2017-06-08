
public class Animal {
//general attributes and behaviors that all animals have

	String type; //for our purposes there will be four types
	//Lion,Wolf,Bear,Gorilla
	int age;
	int weight;
	String furColor;
	
	
	public Animal(String type, int age, int weight, String furColor) {
		//our constructor
		super();
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.furColor = furColor;
	}
	
	
	public void call(){
		switch (type) {
		
		case "Lion":
			System.out.println("I am a " +type+ " and I make the noise Roar!");
			System.out.println("I am "+age+" years old!");
			System.out.println("I weigh "+weight+" pounds!");
			System.out.println("And my fur is "+furColor+"!");
			break;
			
		case "Wolf":
			System.out.println("I am a " +type+ " and I make the noise Howl!");
			System.out.println("I am "+age+" years old!");
			System.out.println("I weigh "+weight+" pounds!");
			System.out.println("And my fur is "+furColor+"!");
			break;
			
		case "Bear":
			System.out.println("I am a " +type+ " and I make the noise Grrr!");
			System.out.println("I am "+age+" years old!");
			System.out.println("I weigh "+weight+" pounds!");
			System.out.println("And my fur is "+furColor+"!");
			break;
			
		case "Gorilla":
			System.out.println("I am a " +type+ " and I make the noise Yell!");
			System.out.println("I am "+age+" years old!");
			System.out.println("I weigh "+weight+" pounds!");
			System.out.println("And my fur is "+furColor+"!");

			break;

		default:
			break;
		}
	}
	
	public void eat(){
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
		
}
