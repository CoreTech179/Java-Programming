public class Main {

    public static void main(String[] args) {
        /* Understanding the structure of Java programm

        1. Everything is written inside a class.
        2. Main method is the entry point of a programm. It has some specific signatures

        public = It is a access modifier, that represents this main method can be accessed from outside of the class.

        static = With the help of the static keyword, it helps the JVM to call the main method without creating any object of the Main class.

        void = It is the datatype that means nothing. We don't want to return anything from the main method

        main = name of the method

        String [] args = Suppose we want to send some information through the main method then we can do this with the help of args array, but if we don't want to send any information then also we need to write it as it is a part of the Java Syntax.

        */

        // To print something
        System.out.println("Hello world!");

        // System = Basically it is a class in the java.lang package which provides access to the system, including the console
        // out = Basically it is a object of PrintStream class within the System class, that represents the standard output.
        // println = A method that prints the text into the console

        // Semi-colon = ; --> It is crusial, because it represents the end of a statement.  

    }
}