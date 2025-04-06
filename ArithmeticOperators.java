public class ArithmeticOperators {
    public static void main(String[] args) {
        
        /*

            ** Arithmetic Operators in Java
            
            int number1 = 10;
            int number2 = 20;

            1. Addition Operator (+)

            int addition = number1 + number2;

            2. Substraction Operator (-)

            int substraction = number1 - number2;

            3. Multiplycation Operator (*)

            int multiply = number1 * number2;

            4. Division Operator (/)

            int divide = number2 / number1;

            5. Modulo Operator (%)
            
            int remainder = number2 % number1;
            
             ** How to Print the ans

            System.out.println(addition);

            System.out.println(substraction);

            System.out.println(multiply);

            System.out.println(divide);

            System.out.println(remainder);
        
        
            ** Associativity Rule (i.e. Operators Priority)

            1. ()
            2. / , * 
            3. + , -

            ++, = (increment and assignment operator)

            ** Compound Assignment Operators

            ex. +=, /=, *=, %=, -=,... etc
        

         */

         int a = 10, b = 20;

         int result = a / b * 3; 
         // Now here since both the operators is having the same priority than it starts its execution from L --> R

         int reslt1 = a + b * 4; // first * operator will evaluate and then + operator will evaluate (i.e from R --> L)

         int reslt2 = (a + b) * 4; // since brackets is having the greatest priority therefore it will evaluate 1st and then * operator will evaluate.

        
        //  Compound Assignement Operator

        // a = a + 10; // Short hand of this

        a += 10; // Still output will be 20 
        // System.out.println(a);

        // Increment Operator 

        // If we want to increment a value by a single value only than we can do it by using the increment operator

        int increment = 2;
        increment++;
        // System.out.println(increment);

        // Fun fact of increment operator!!!

        // Difference b/w ++a (1st increment the value that means Pre-increment) and a++ (Later increment the value that means Post-Increment)

        // a++ = It means 1st it will consume the value of a and then later increase the value of a by 1
        // ++a =  It will 1st increment the value of a and then consume the value of a later
        
        int number1 = 1;
        // int number2 = number1++;
        // int number3 = ++number1;
        // System.out.println(number2);
        // System.out.println(number1);
        // System.out.println(number3);

        int temp = 1;
        System.out.println(temp++ + --temp);


         

    }
}
