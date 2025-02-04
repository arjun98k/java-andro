


class TP1{
	int Sum(int a , int b){
		return a+b;
	}
}


class TP2  {
	String Uppercut(String a){
		String b = a.toUpperCase();
		return b;
	}
}

class TP3 {
	 String GreetMessage(){
	String	d = "good morning";
	System.out.println(d);
          return d;
	} 
}

class Method1 {
    private String Adi(){
		String a = "hii";
		System.out.println(a);
		return a;

	}

	public static void main(String[] args){
		TP1 ac = new TP1();
		TP2 bc = new TP2();
		TP3 dc = new TP3();
		System.out.println(ac.Sum(10,20));
		System.out.println(bc.Uppercut("akash"));
		dc.GreetMessage();
		Method1 xz = new Method1();
		xz.Adi();

	}
}