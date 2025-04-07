class Car{

    // Note: Here Blueprint is created but it doesn't takes space inside the memory. When a Object is created from this blueprint than that created object will takes space inside the memory.

    String model; // Properties

    String color;

    private String brand; // By declaring this property as private as a result the data is hidden. We cannot access this particular property directly.

    int speed;

    public void accelerate(int increment){
        speed += increment;
    }

    public void brake(int decrement){
        speed -= decrement;
        if(speed == 0){
            speed = 0;
        }
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void getBrand(){
        System.out.println(this.brand);
    }

}


/*
 * Understanding Inheritance in Java (Overview)
 * 
 * Q. What is Inheritance in Java ?
 * 
 * --> When a child class inherits some properties and methods from the Parent class than it is called as Inheritance. 
 * 
 * --> We can inherit a child class by using the "extends" keyword in Java. By using the extends keyword on the child class than all the properties of the Parent class will passed down to the Child class.
 * 
 * 
 */

class Animal{

    // Parent Class

    private String name;
    private int age;

    public void setName(String name){
        name = this.name;
    }

    public void getName(){
        System.out.println(this.name);
    }

    public void setAge(int age){
        age = this.age;
    }

    public void getAge(){
        System.out.println(this.age);
    }

}

class Cat extends Animal{

    // Child Class

    private String breed;

    public void setBreed(String breed){
        breed = this.breed;
    }

    public void getBreed(){
        System.out.println(this.breed);
    }

}

/*
 * Understanding Polymorphism
 * 
 * Basically in a Polymorphism we can create a reference variable of Parent class and create a object using the child class 
 * 
 * i.e. Ex. Animal obj = new Cat();
 * 
 * or Parent obj = new Child();
 * 
 */

 class Parent{
    public void sound(){
        System.out.println("Make some sound");
    }
 }

 class Child extends Parent{
    @Override
    public void sound(){
        System.out.println("Woof!");
    }
 }


public class OOPS {

    public static void main(String[] args) {
        
        /*
         * Q.What is Object Oriented Programming ?
         * 
         * Basically it is a way of writing programs using objects intead of just using functions and instruction in Java is known as Object oriented programming. 
         * 
         *  Q. What is a class in Java ?
         * --> Basically a class is known as a blueprint. When a class is created it doesn't take space inside the memory.
         * 
         * --> Example: Suppose we have a Blueprint of a Car then it is having some properties like (i.e. what is the model, color, brand, speed, etc). It also having some behaviors like accelerate, brake, etc. These behaviours are declared in the form of methods.
         * 
         * class Car{
         * 
         *      String model; // Properties
         * 
         *      String color;
         * 
         *      String brand;
         * 
         *      int speed;
         * 
         *      public void accelerate(int increment){ // Behaviours
         *             speed += increment;
         *      }
         * 
         *      public void brake(int decrement){
         *            speed -= decrement;
         *            if(speed == 0){
         *                speed = 0;
         *            }
         *      }
         * }
         * 
         * 
         * 
         */

         Car car = new Car(); // An object is created therefore it will takes space inside the heap memory because we have created the object by using the new keyword. 

        //  Now we can set the properties of this car object as defined inside the blueprint.

        // car.brand = "tata"; 
        // We have made brand property as Private therefore we can't assign a value to that particular field directly. We need to use getters and setters for this. 

        car.setBrand("tata");
        car.getBrand();
        car.color = "red";
        car.model = "Alto";
        car.speed = 40;


        System.out.println(car.speed); // Access the value of a particular property directly 

        car.accelerate(10);

        System.out.println(car.speed);



        /*
         * 
         * Q. What are the 4 pillers of the Object Oriented Programming Language?
         * 
         * The 4 pillers of the Object Oriented Programming language are
         * 1. Encapsulation
         * 2. Abstraction
         * 3. Inheritance
         * 4. Polymorphism
         * 
         * 
         * (i) Encapsulation = Basically it is a method through which all the variables and the methods reside within a single unit is known as encapsulation.
         * 
         * --> Here we declare properties of a class as private and class methods as public. 
         * 
         * --> Since we have set all the properties as private than we can't access it directly therefore for setting the properties and printing the values of the properties we use getters and setters in Java.
         * 
         * 
         * 
         */



         // Polymorphism 

         Parent obj = new Child(); 
        //  During the compilation time the compiler will bind the obj with the method of the Parent class but as soon as the JVM comes it will check during the runtime what type of Object is created and based on the type of object is created the method of that class will execute. This is known as dynamic method dispatch. 
         obj.sound();



         // Abstaraction
        //  Hiding implementation details is known as Abstarction. In comming Lectures Later we will see it in details!!! 

    }
}