
class Student{
	int roll_no;
	String name;
	String clgname;

	public Student(int roll_no,String name, String clgname ){
		this.roll_no = roll_no;
		this.name    = name;
		this.clgname = clgname;
	}
	void Display(){
		System.out.println(roll_no+ " "+ name+" "+ clgname);
	}
} 
 
class ThisKey{
public static void main(String[] args){
Student obj = new Student(22,"arjun","scoe");
obj.Display();


}
}