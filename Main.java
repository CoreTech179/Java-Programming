public class Main {

    public static void main(String[] args) {

        /*
            Before Understanding the structure of the java program let's understand some concepts before that was asked me at the time of interview!

            Q. What is JDK, JRE and JVM ?

            1. JDK stands for Java Development Kit. It internally contains JRE & JVM where JRE stands for Java Runtime Environment and JVM stands for Java Virtual Machine. Basically JDK provides all the neccessary tools which is required to work with the java language.

            2. JRE stands for Java Runtime Environment. Basically it provides an environment to execute the java programm. It internally contains JVM which is responsible to execute the java programm.

            3. JVM stands for Java Virtual Machine. Basically it is a software in the form of an interpreter which is written in C language through which we can execute our java programm.

            Q. Why Java is your preffered programming language ?

            ->I choose Java as my preffered programming language because Java is a platform independent programming language. 

            ->Platform independent programming language means we can run our Java programms on any kind of OS (either it is a Windows OS, Ubuntu OS or mac OS) without any kind of modifications.  
            
            -> If we compare Java with C++ or python then C++ required different compilations at different systems. Similary in case of python also we need to install various dependencies as a result there may be some compatibility issues may arise so that is the reason I choose Java as my preferred language.

            Q. Whta is JIT ? 
            Full form of JIT is Just In Time Compiler in java and it is a part of the JVM. It compiles the bytecode into the machine code (i.e. 0 & 1 format) at the runtime. 
            During runtime if a particular method is using frequently than that method will be compiled once and kept into the memory.


            Q. What are the 3 features of Java ?
            1. Java is a platform independent programming language.
            2. Since Java is a Object oriented programming language as a result it makes the code more modular and reuseable.
            3. Java automatically performs memory management such that to reduce memeory loss.

         */


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