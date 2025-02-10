class inheritance2 {
	public static void main(String[] args){
    Dog obj1 = new Dog();
    obj1.eat();
    Puppy obj2 = new Puppy();
    obj2.breathe();
    obj2.play();
    obj2.wagtail();
    obj2.bark();
	}
}

class Animal{
	void eat(){
		System.out.println("Animal can eat");
	}
	void breathe(){
		System.out.println("Animal can breathe");
	}
}


class Dog extends Animal{
	void bark(){
		System.out.println("dogs can bark");
	}
	void wagtail(){
		System.out.println("dog can wag their tails");
	}
}

class Puppy extends Dog{
	void sleep(){
		System.out.println("puppy can sleep");

	}
	void play(){
		System.out.println("puppy can play");
	}
}