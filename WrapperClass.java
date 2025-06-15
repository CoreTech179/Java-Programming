public class WrapperClass {
    public static void main(String[] args) {
        
        /*
         * Q. What is Wrapper Class ?
         * 
         * Basically Wrapper classes are used to wrap the primitive datatypes
         * 
         */

        //  example

        int a1 = 1; // a1 is a primitive variable & it is stored inside the stack

        // &

        Integer a2 = 1; // This Integer class is a wrapper class for the primitive dataType "int"

        // Since a2 is a object or reference variable of Integer class therefore the data is stored inside the heap memory

        // Basically Wrapper classes converts the primitive dataTypes into objects

        // Note: Converting a primitive dataType into a Object automatically is known as auto-boxing

        // In int a2 = 1 --> a2 is a primitive dataType & when we do Integer a2 = 1 --> Java do auto-boxing automatically.

        // Since a2 is a Object therefore we can access to various methods of the Integer class

        // There are many Wrapper classes similar to primitive dataTypes (i.e. Byte, Short, Float, Long, Boolean, Character,.. etc.)

    }
}
