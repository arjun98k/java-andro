class Animals{
	void makesound(){
		System.out.println("sound sound");
	}
	
}
class Dog extends Animals{
	void makesound(){
	System.out.println("bark woof");
}
}
class Cat extends Animals{
	void makesound(){
	System.out.println("meow meow");
}
}






class OOPS3 {
	public static void main(String[] args){

		Animals dog = new Dog();
		Animals cat = new Cat(); 
		//polymorphism example
		dog.makesound();
		cat.makesound();

	}
}