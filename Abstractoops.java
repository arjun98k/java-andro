class  Abstractoops {
public static void main(String[] args){
	Animal obj = new Dog();
	obj.animalSound();
}
}

abstract class Animal{
	abstract void animalSound();

	void makesound(){
		System.out.println("animal make sound");
	}
}

class Dog extends Animal{
	void animalSound(){
		System.out.println("animal make sound like bhaw");

	}
}





// Abstraction in Java is a concept that helps to hide the complexity of the system and only show the essential details to the user. It allows us to focus on what an object does rather than how it does it.

// In Java, abstraction is achieved using:

// 1. **Abstract classes** – These are classes that cannot be instantiated on their own and must be subclassed. They can have both abstract (without implementation) and concrete (with implementation) methods.
// 2. **Interfaces** – An interface is like a contract that a class must follow. It can only have method signatures and constants (no method implementation).

// ### Example of Abstraction using an Abstract Class:

// ```java
// // Abstract class
// abstract class Animal {
//     // Abstract method (no implementation)
//     public abstract void sound();
    
//     // Regular method (with implementation)
//     public void sleep() {
//         System.out.println("This animal sleeps.");
//     }
// }

// // Subclass (inherited from Animal)
// class Dog extends Animal {
//     // Providing implementation for the abstract method
//     public void sound() {
//         System.out.println("The dog barks.");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         // Cannot create an object of Animal because it is abstract
//         // Animal animal = new Animal();  // Error

//         // Can create an object of the subclass Dog
//         Animal myDog = new Dog();
//         myDog.sound();  // Output: The dog barks.
//         myDog.sleep();  // Output: This animal sleeps.
//     }
// }
// ```

// ### Key Points:
// - **Abstract class `Animal`**: Contains an abstract method `sound()` and a concrete method `sleep()`.
// - **Class `Dog`**: Provides an implementation for the `sound()` method.
// - **Abstraction**: We don’t know how the sound is made by the animal; we only know it can make a sound. The details of the sound (like barking) are hidden inside the `Dog` class.

// This way, abstraction helps in hiding the implementation details and only exposing essential features to the user.