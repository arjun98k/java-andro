class Polymorphism {
	public static void main(String[] args){
		Animal dog = new Dog();
		dog.animalSound(); // metodoverriding
		Animal cat = new Cat();
		cat.animalSound(); // metodoverriding

	}
}

class Animal{
	void breathe(){
		System.out.println("animal can breathe");
	}
		void walk(){
			System.out.println("animal can walk");
		}
		void animalSound(){
			System.out.println("animal can make sound");
		}
	}

class Dog extends Animal{
	void play(){
		System.out.println("dog can play");
	}
	@Override
	void animalSound(){
		System.out.println("dog can bark");
	}
}

class Cat extends Animal{
	void drink(){
		System.out.println("cat drink milk");
	}
	@Override
	void animalSound(){
		System.out.println("cat can make meow meow sound");
	}
}