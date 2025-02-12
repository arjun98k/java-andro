interface Aksh{
	void sound();
}

class Dog implements Aksh{
	@Override
	public void sound(){
		System.out.println("dog barks");
	}
}

class cat implements Aksh{
	@Override
	public  void sound(){
		System.out.println("cat meow meow");
	}
}

public class Interface1{
	public static void main(String[] args){
		Aksh obj = new Dog();
		obj.sound();
	}
}