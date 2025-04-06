public class StringClass {
    public static void main(String[] args) {
        /*

            Q. What is a String ?
            --> Basically it is a sequence of characters.

            Note: String is not a primitive datatype. It is a class in java and it is written inside the double quotes.

            Like this ! Ex. String name = "Akash";



         */

        //  How to create a String in Java

        // Method 1
         String name = "ram";

        //  Method 2
        String memoryLocation1 = new String("ram");

        // Difference between method 2 declaration and the declaration below is having the same value? 
        // ans is false because when we used the "new" keyword than it will create the String with a different memory location inside the heap memory in Java. 

        String memoryLocation2 = new String("ram");

        // Let's verify
        System.out.println(memoryLocation1 == memoryLocation2);


        // Let's check whether the value of the declaration 1 is same as name2 ? Let's verify
        // The result is true because both the variables name & name2 is pointing to the same memory location. 

        // Note: here double equals operator (==) is only checking both the memory location is same or not. It is not checking whether it contains the same value or not.  
        // But we can check whether both the data is having the same value or not by using the equals() method in Java !!

        // No Rocket science!!

        String name2 = "ram";

        System.out.println(name == name2);

    }
}
