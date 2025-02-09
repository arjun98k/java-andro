class  Constructor2 {
	public static void main(String[] args){
     Const1 obj1 = new Const1();
     Const1 obj2 = new Const1(11,"arjun","sde");
     System.out.println(obj2.name);
       System.out.println(obj2.age);
         System.out.println(obj2.job);
	}
}


class Const1{
	int age;
	String name;
	String job;

	public Const1(){
		System.out.println("hey we are default const");
	}

	public Const1(int age , String name, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
}