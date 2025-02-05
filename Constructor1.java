
class Default1{

	public Default1(){
	System.out.println("called default Constructor1");
}

public Default1(String name){
	
	System.out.println(name);

}
}

class Constructor1{
public static void main(String[] args){
    Default1 obj = new Default1();
      Default1 obj1 = new Default1("Arjun");

}
}