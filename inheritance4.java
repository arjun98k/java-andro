public class inheritance4 {
    public static void main(String[] args) {
        Student obj1 = new Student("arjun kandekar");
    Student obj2 = new Student("karn kandekar");

    Student[] studentss = {obj1, obj2};

    Teacher teacher = new Teacher("aditi", studentss);
    teacher.show();
    }
    
       

}

class Student{
    private String name;

    Student(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}

class Teacher{
    private String name;

    private Student[] students;

    Teacher(String name, Student[] students){
        this.name = name;
        this.students = students;

    }
    public void show(){
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
