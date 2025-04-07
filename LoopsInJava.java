public class LoopsInJava {

    public static void main(String[] args) {
        
        /*
            **Loops in Java

            Q.Why we need a loop ?
            Suppose we are performing the same task repeatedly than we can use a loop.

            Ex. Suppose we need to print "hello" 100 times than obviously we can't write System.out.println("Hello") for 100 times. Obviously it is a foolish way!!!

            Therefore we use loops in that case

            --> There are mainly 3 types of loops are there
            (a) While loop
            (b) for loop
            (c) do-while loop

            Syntax for While loop

            initialization

            while(condition){

                // body

                // Updation

            }
            
            meaning of while is = until and unless the condition becomes false perform the same task repeteadly. 


            Syntax for do-While loop (we will use this loop in rare case)
            
            initialization

            do{

                // code block

                // Updation

            }while(condition);

            Note: for the 1st time only it will execute the code block after that it will check the condition every time and then execute the code block.


            Syntax of for loop (99 % we will use this loop)

            for(initialization; condition; updation){
                // your code
            }


            // We can also use Nested for loops also like this (But not needed at the moment write now!!!)

            for(initialization; condition; updation){

                for(initialization; condition; updation){
                        // Code block
                }

            }

         */

        //  Example of while loop

        int i = 0; // Initialization

        // Note: This initialization is having a disadvantage that is since we have declared i = 0 outside of the loop as a result we can't re-declare that variable again anywhere inside the main function!!!! 

        while (i < 10) { // Condition
            System.out.println("Hello");
            i++; // Updation 
            // If we will not increment the value than it will print "hello" infinite times because i is alaways 0 (constant). Therefore we need to update the value of i after every print statement. 
        }


        int j = 0; // Initialization

        do {
            System.out.println("zero"); // your code
            j++; // Updation
        } while (j != 1); // condition

        for(int k = 0; k < 5; k++){
            System.out.println("yeah!");
        }


        // Q. Print sum of 1st 10 natural numbers using for loop in Java
        int sum = 0;
        for(int m = 0; m <= 10; m++){
            sum += m;
        }
        System.out.println(sum);

        // Q. Count Digits of a number using for loop in Java

        int number = 458759;

        int count = 0;

        while (number != 0) {
            number = number / 10;    
            count++;
        }

        System.out.println(count);


        // Break and continue (skip) keyword in Java

        for(int n = 1; n < 10; n++){
            // Suppose for some reason we want to break out from the loop at n = 100. We don't want to execute the entire loop than we use break statement 
            System.out.println("Good morning");

            // if(n == 6){
            //     break;
            // }
            
            if(n == 2){
                continue;
            }

            // Suppose for some reason we want to skip a particular portion from the loop at n = 2. As a result we can do it using the continue statement

        }

        // No rocket Science!!
    }
}