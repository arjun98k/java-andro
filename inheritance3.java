class inheritance3{
	public static void main(String[] args){
    Dog obj1 = new Dog();
    Eagle obj2 = new Eagle();
    obj1.eat();
    obj1.giveBirth();
    obj1.breathe();
    // obj1.fly(); will give compilation error

    obj2.fly();
    obj2.layEggs();
    obj2.hunt();
    // obj2.wagtail(); it will give compilation error
	}
}

class Animal {
	void eat(){
		System.out.println("animal can eat");
	}
	void breathe(){
		System.out.println("animal can breathe");
	}
}

class Mammal extends Animal{
	void giveBirth(){
		System.out.println("can give birth to mammals");
	}
	void hasFur(){
		System.out.println("mammals has thier furs");
	}
}

class Bird extends Animal{
	void fly(){
		System.out.println("birds can fly");
	}
	void layEggs(){
		System.out.println("birds can lay eggs");
	}
}
class Dog extends Mammal{
	void bark(){
		System.out.println("dogs can bark");
	}
	void wagtail(){
		System.out.println("dog can wag their tails");
}
}
class Eagle extends Bird{
	void hunt(){
		System.out.println("Eagle can hunt animals for food ");
	}
	void soar(){
		System.out.println("eagle can soar");
	}
}

