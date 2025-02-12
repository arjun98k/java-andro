 class  Intialzer{
 	public static void main(String[] args){
      Creat obj = new Creat();
     
 	}
 }


 class Creat {
 	String ak;
 	int rollno;

 	{
 		ak = "arjun";
 		rollno = 98;
 		System.out.println("the student name is " + ak + "" +" and his rollno is "+ rollno );

 	}

 	       public Creat(){
 		System.out.println("constructor get call after intializer block");
 		
 	}


 }