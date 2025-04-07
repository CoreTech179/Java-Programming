public class JavaArrays {
    public static void main(String[] args) {
        /*
         * Arrays in Java
         * 
         * Q. Why do we need a array ?
         * Suppose for some reason we want 100 different values of the same type as a result we can't declare 100 variables. This is a foolish way !!! As a result to overcome this problem we use an Array
         * 
         * Q. What is a Array ?
         * Collection of similar kind of data is known as array. 
         * 
         * 
         * Syntax to declare an Array
         * 
         * Method 1
         * 
         * dataType [] variable_Name = {number1, number2, .......};
         * 
         * Method 2
         * 
         * dataType [] variable_Name = new dataType [size_Of_Array];
         * 
         * Note: Here the variable_Name contains the memory location (starting address) & the actual array is created at the heap memory. 
         * 
         * Note: When we use the new keyword then it will allocate memory inside the heap memory.
         * and When we declare 
         * 
         * int a = 10;  =  Here memeory is allocated at the stack memory
         * 
         * 
         * To find out the length of the Array we use an in-built function
         * i.e. Array_Name.length function
         * 
         * // Array Indexing starts from 0 and goes till (Array_Name.length-1)
         * 
         * 
         * Assigning a value to the array like this
         * 
         * ArrayName[0] = value1;
         * ArrayName[1] = value2;
         * ArrayName[2] = value3;
         * 
         * 
         * 
         * 
         * 
         * 2-Dimensional Array (2D Array)
         * 
         * Q. How to declare 2D Array
         * 
         * Method 1
         * 
         * dataType [][] variable_Name = new dataType[No_Of_rows][No_of_Columns];
         * 
         * 
         * Method 2
         * 
         * dataType [][] variable_Name = {
         *        {1, 2, 3},
         *        {4, 5, 6},
         *        {7, 8, 9}
         * };
         * 
         */

        //  When we declare an array by default all the values are zero
        // To find out the length of the array we can use an in-built function i.e. array_Name.length function (99 % we will use it)

         int [] arr = new int[10];

         for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
         }

         System.out.println(arr.length); // Print the length of the array


        //  Assigning data inside the array
         arr[0] = 10;
         arr[1] = 20;
         arr[2] = 30;
         arr[3] = 40;

         for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
         }

        //  For-Each loop in Java
        // Why we haven't learn this loop in Loops lecture because it works with arrays

        int [] numbers = {1, 2, 3, 4};

        for(int i : numbers){
            System.out.println(i);
        }


        // Q. Search an element inside the array

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 3){
                System.out.println("Number 3 found!");
                break;
            }
        }

        // Q. Find out the Sum of the elements of the Array

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println(sum);



        // Declare 2D Array

        int [][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access 2d array element

        System.out.println(nums[0][0]); // It means 1st row 1st number
        System.out.println(nums[0][1]); // It means 1st row 2nd number
        System.out.println(nums[0][2]); // It means 1st row 3rd number

        // But we have already learned loops in Java therefore we can do it using nested loops in Java

        for(int row = 0; row < nums.length; row++){
            for(int column = 0; column < nums.length; column++){
                System.out.print(nums[row][column]+" ");
            }
            System.out.println();
        }


    }
}
