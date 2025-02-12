class SuperKey1 {
	public static void main(String[] args){
		Dog obj1 = new Dog();
		obj1.showColor();

	}
}


class Animal{
	String color = "black";

}

class Dog extends Animal{
	String color = "blue";
	void showColor(){
		System.out.println(color);
		System.out.println(super.color);
	}
}