/*
 * Syntax of Generics
 */


//  Generic Class

import java.util.List;

class Box<T>{

    // Here T means DataType

    // We can write anything instead of T such as P, G, ... etc. But there is some Conventions we should follow.

    // Like T for what DataType

    // Like K & V for Key-value Pair.

    // N for Numbers

    // E for element (used in Collection Framework)

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}


class Pair<K, V>{
    private K key;

    private V value;

    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void getData(){
        System.out.println("Key-Value Pair is = "+ key +" - " + value);
    }
}



// Generic Interface & its implementation by Generic Class
// Here we also pass multiple parameters like K, V like that

interface A<T>{

    void add(T item);

    T get();

}

class Child<T> implements A<T>{

    private T item;

    @Override
    public void add(T item){
        this.item = item;
    }

    @Override
    public T get(){
        return item;
    }

}


// Bounded Type Parameter (i.e. Apply boundation on the Type)

interface Printable{
    void print();
}

class MyClass extends Number implements Printable{
    private int number;

    MyClass(int number){
        this.number = number;
    }

    @Override
    public int intValue(){
        return number;
    }

    @Override 
    public long longValue(){
        return number;
    }

    @Override 
    public float floatValue(){
        return number;
    }

    @Override 
    public double doubleValue(){
        return number;
    }

    @Override
    public void print(){
        System.out.println(number);
    }

}

// Here we have bounded the Type parameter by extending a class & implementing a Interface.
// Syntax is always = T extends className & interfaceName
class Boxx<T extends Number & Printable>{

    // Here T should be that Type that extends the Number Class & also implementing the Printable interface

    private T item; // Here when T becomes MyClass Type, it is just holding the reference of MyClass which is already created (i.e.myClassObj) 

    Boxx(T item){
        this.item = item;
    }

    public T getReference(){
        return item;
    }

    public void display(){
        item.print(); // MyClass object.print() method will run when we call display method
    }
}


// How to make a Constructor Generic without defining the class as Generic

class Container{

    // Here if we do this simply than obviously Java will not undertand

    /* 
    
        Container(T value){ 

        }

    */

    // Rather we do this

    /*
        public <T> Container<T Value>{
        
        }
    */

}



// Java Generics Wild Card (?)
/*
 * Basically it is a special type of argument that can be used in method arguments or class definations to represent the Unknown Type. 
 * 
 * It allows more flexibility & dynamic code by letting the Type to be specified later 
 * 
 * We only use question mark in read operations only
 * 
 */



public class GenericsPart2 {

    // Generic Method Syntax

    /*
     *  public static <T> returnType methodName(T parameter){
     *           
     *     
     *  }
     * 
     */

    //  Example

    public static <T> void printArray(T [] array){
        for(T element : array){
            System.out.print(element +" ");
        }
        System.out.println();
    }


    // WildCard example in Generics

    public void printNumbers(List<? extends Number> list){

        // This method can only READ. We can't modify or add item

        // ? = means it can take any arrayList but it must extends Number Class or its subclasses 

        for(Number n : list){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        
        Box<Integer> obj = new Box<>(); // The advantage is that now we can work with any Type of data as per our requirement. 
        // Because Now this Box class is Type safe & will throw an error during compilation time

        obj.setValue(10);

        System.out.println(obj.getValue());

        Pair<Integer, String> pObj = new Pair<>(10, "Akash");
        pObj.getData();

        MyClass myClassObj = new MyClass(10);
        Boxx<MyClass> boxxObj = new Boxx<>(myClassObj);
        boxxObj.display();
        System.out.println(boxxObj.getReference());

        // Here we pass MyClass as the Type parameter for the Boxx class because we see that MyClass is extending the Number class & implementing the Printable interface

        Integer [] array = {1,2,3,4}; // Since the printArray method is a Generic class therefore we have to declare the array with Wrapper class not just simple "int" like this.

        printArray(array);


    }
}
