 class inheritance1{
 	public static void main(String[] args){
     ElectricCar obj = new ElectricCar();
     System.out.println(obj.model);
    obj.checkBatterystatus();

 	}
 }



 class Car{
 	String model = "Xuv";
 	String maker="tata";
 	int year;
 	String color;

 	//  model = "xuv";
 	// maker = "Tata";

 	void startEngine(){
 		System.out.println("Engine is started");
 	}

 	void accelerate(){
 		System.out.println("car is accelerate");
 	}
 }

 class ElectricCar extends Car{
 	int battercapcity;
 	int chargetime;

 public	void chargeBattery(){
 		System.out.println("battery is charging");
 	}
 public	void checkBatterystatus(){
       System.out.println("battery is fully charged");
 	}
 }


//  Let's break down **why the error happened** in simple terms:

// ### What the Error Means:
// The error you encountered was:
// ```java
// inheritance1.java:5: error: 'void' type not allowed here
// System.out.println(obj.checkBatterystatus());
// ```
// This error happened because you were trying to **print the result of a `void` method** using `System.out.println()`. Here's why that causes an issue:

// ### 1. **Void Methods Don't Return Anything**
// - A `void` method in Java **does not return any value**. It just performs an action (like printing something inside the method).
// - When you try to print something, Java expects to be able to get a **value** (like a `String`, `int`, or `boolean`) to print.
// - But a `void` method doesn't give anything back to `System.out.println()`, so **Java can't print it**.

// ### 2. **The Print Statement Expects a Value**
// - `System.out.println()` is designed to **print a value**. You can use it like this:
//   - `System.out.println("Some text")` – to print a string.
//   - `System.out.println(5)` – to print an integer.
//   - `System.out.println(obj.checkBatteryStatus())` – if `checkBatteryStatus()` returns a `String`, it will print that string.

// - But when you try:
//   ```java
//   System.out.println(obj.checkBatteryStatus()); 
//   ```
//   and `checkBatteryStatus()` is `void`, **there's nothing for Java to print** because `void` means **no value**.

// ### Why the Error Happens:
// When Java sees `System.out.println(obj.checkBatteryStatus());`, it expects `checkBatteryStatus()` to return something (a value, like a `String` or `int`). But since the method is `void`, it doesn't return anything — and **Java can't print "nothing"**.

// ### How to Fix It:
// There are two main ways to fix this:

// 1. **Print directly inside the method** if it's `void`:
//    - You can print the status inside the method itself, as follows:
//      ```java
//      void checkBatteryStatus() {
//          System.out.println("Battery is fully charged");
//      }
//      ```
//    - Now, when you call `obj.checkBatteryStatus()`, it will **print** the message directly from inside the method.

// 2. **Return a value (non-void)** if you want to print it outside the method:
//    - Change the method to return something (like a `String`) instead of `void`:
//      ```java
//      String checkBatteryStatus() {
//          return "Battery is fully charged";
//      }
//      ```
//    - Now you can print it using:
//      ```java
//      System.out.println(obj.checkBatteryStatus());
//      ```

// ### In Summary:
// - The error happened because you tried to **print a `void` method**, which has no return value. 
// - `System.out.println()` needs a **value** to print, but `void` methods don't give any value back.
// - You can either **print inside the `void` method** or **change the method to return a value** that you can print outside.