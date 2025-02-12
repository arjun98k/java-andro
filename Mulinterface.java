class Mulinterface {
	public static void main(String[] args){
     C obj = new C();
     obj.methodA();
	}
}

interface A{
	void methodA();
}

interface B{
	void methodB();
}


class C implements A, B {
	void methodC(){
		System.out.println("method of c");

	}

	public void methodA(){
		System.out.println("method from class A");
	}
	public void methodB(){
		System.out.println("text");
	}
}