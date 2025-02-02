class Car{
    int car_no;
    String car_brand;
    int car_speed =97;


    void CarSpeed(){
        car_speed+=1;
        System.out.println(car_speed);
    }
    void CarBrand(){
        System.out.println("Tata");
    }
}


public class OOPS1 {
    public static void main(String[] args) {
        
        Car s1 = new Car();

        s1.CarBrand();

        s1.CarSpeed();
        
    }
    
}
