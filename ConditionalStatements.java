public class ConditionalStatements {
    public static void main(String[] args) {
        /*
            ** Relational Operators in Java

            --> Relational Operators compares 2 values and returns a boolean result 
            1. < (less than)
            2. > (greater than)
            3. != (not equals)
            4. == (double equals)
            5. >= (greater than equals)
            6. <= (less than equals)

            ** Logical Operators in Java (Basically these operators are used to combine 2 conditions together)

            1. && (Logical AND) = If this operator is used for combining 2 conditions than both the conditions should be true otherwise the result will be false.

            2. || (Logical OR)  = If this operator is used for combining 2 conditions than anyone of the condition should be true otherwise the result will be false.

            3. ! (NOT)


            ** Conditional Statements in Java
            Synatax

            if(condition){
                // your code
            }
            else if(another condition){
                // you code
                // Basically multiple else if conditional blocks can be used to check multiple conditions
            }
            else{
                // your code
            }

            // Short hand of this if-else statement is 

            ** Ternary Operator in Java (We will use it whenever possible)

            Syntax
            datatype variableName = (condition) ? result1 : result2;

            // Basically in a ternary operator if the condition is true than the result1 will be assigned to the variable else result2 wil get assigned.

         */

        //  example 1
        int a = 1, b = 2;
        boolean ans = (a < b);
        System.out.println(ans);

        // Logical Operator example
        int age = 18;
        int ramMarks = 35;
        System.out.println(age >= 18 && ramMarks >= 33);
        System.out.println(age >= 18 || ramMarks >= 40);
        System.out.println(age != 18 && ramMarks >= 40);


        // Example of Conditional Statements in Java

        if(age >= 18){
            System.out.println("Eligible");
        }
        else if(age < 18){
            System.out.println("Not Eligible");
        }
        else{
            System.out.println("Anyone of the conditions not satisfied");
        }

        // We can use a short hand for this (whenever possible!!)
        boolean isAdult = (age >= 18) ? true : false;
        System.out.println(isAdult);


        // Multiple conditional else if block example

        // Suppose We need to assign grades for the respective marks

        // 1. for marks >= 90 than Grade A
        // 2. for marks >=75 than Grade B
        // 3. for marks >=60 than Grade C
        // 3. for marks < 60 than Grade D

        int marks = 75;

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks >= 60){
            System.out.println("Grade C");
        }
        else if(marks < 60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail!");
        }


        // But here a disadvantage is that, it will check every conditions one by one. It will not jump directly. 
        // As a result to overcome this problem we can use switch statement in Java

        // Basically switch statement will not check each an every conditions one by one just like if-else, it will directly jump to that case that matches the case number inside the switch statement.  
        
        // Switch Case in Java

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tue");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thus");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            default:
                System.out.println("Invalid");
        } 

     }
}
