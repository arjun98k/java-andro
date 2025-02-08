
class enCapsul{
	private String student;
	private int id;

	public void setData(int id , String student){
		this.id = id;
		this.student = student;
	}
	public String getData(){
		return student;
	}
	public int getid(){
		return id;
	 }
	}

   

class OOPS4{
  public static void main(String[] args){
  	enCapsul obj1 = new enCapsul();
  	obj1.setData(11,"Arjun");
  	System.out.println(obj1.getData());
  	System.out.println(obj1.getid());
  }
}