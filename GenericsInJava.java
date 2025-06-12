import java.util.ArrayList;

public class GenericsInJava {

    public static void main(String[] args) {
        
        /*
         * Generics in Java
         * 
         */

        //  What is Generics ?
        // Basically Generics allows you to define a class, interface or methods with placeholders for the dataType they will work with.

        // Example:

        // Suppose we have declared an ArrayList & we are adding some data
        ArrayList list = new ArrayList();

        // Here we see that we can able to add Integer number 10, also we can add String value "hello" & again we can abale to add a floating point number also. There is no issue.

        list.add(10);
        list.add("hello"); // No compilation error but runtime error will happen for sure
        list.add(3.51f);

        // Now we are try to retrieving the data using .get() method

        Float o3 = (Float) list.get(2);
        String o2 = (String) list.get(1);

        // Now suppose we thought that this will be a String & we cast it into String manually by mistake, but we see that on index number 0 there is an Integer number & we are trying to get a String value which is an error.

        String o1 = (String) list.get(0);

        // Here we are adding any some another value & try to get some another value, what we are doing ???? 

        // Hence it is not Type safe & manual casting is required.


        // But now as soon as we do this (i.e. Inside the Diamond brackets we have defined that what type of data we need to store inside the list, as a result it immediately becomes Type safe & now if we try to add any data rather than String it will throw an error)

        ArrayList<String> list1 = new ArrayList<>();

        list1.add(1234); // It is showing error!! Compilation error 

    }
    
}