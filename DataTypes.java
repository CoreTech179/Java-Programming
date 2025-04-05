public class DataTypes {
    public static void main(String[] args) {
        /*
        
        Primitive Datatypes in Java

        Q. What is datatype ?
        The data that we are dealing with is what type of it is. Either it is a number, character, boolean, etc. is known as datatype.

        // Primitive Datatypes are

        // Whole numbers
        1. byte (1 byte) where 1 byte = 8 bits in the form of 0 and 1
        2. short (2 bytes)
        3. int (4 bytes)
        4. long (8 bytes)

        // Decimal Numbers
        5. float (4 bytes)
        6. Double (8 bytes)

        // Characters (i.e. a, b, c,...z, A, B, C,....Z)
        7. char (2 bytes)

        // Boolean (i.e. true or false)
        8. boolean
        

        Note: If we want to check the maximum and minimum capacity of a particular datatype than we can do this. 

        Like this!

        System.out.println(Byte.MAX_VALUE); = o/p = 127
        System.out.println(Byte.MIN_VALUE); = o/p = -128

        Note: For other datatypes just we want to replace "Byte" by "Short" or "Integer" or "Long" or "Float" or "Double" or "Character"

        Note: In case of long datatype we need to specify "l" at the end of a particular number.This "l" represnts it is a long type.

        ex. 1000000l (Like this)

        --> Similary for float type also we need to specify "f" at the end of a number because this "f" represents it is a float type.

        ex. 1.25f (like this)


        Q. What is TypeCasting ?
        Basically it is the process of converting a particular datatype into an another datatyoe is known as type-casting. 

        Converting a character into a number type

        char element = 'A';
        System.out.println((int) element); = o/p = 65 = because in memory it is storing in the form of a number.

        Converting a particular number into a character type

        int character = 57;
        System.out.println((char) character);

        Note: In case of Character datatype if we check its minimum and maximum capacity than it will print a symbol that we don't understand but we know type-casting therefore we can typecast it into a number.
        
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);


        Note: In case of Type-casting we can't convert a decimal number into a whole number. If we do so than there will be some loss of data because the decimal part will get vanished and only the number will remains as it is.

         float a = 1.7f;
         int b = a;  // Throw an error because java will not able to convert it automatically 
         int c = (int) a; // Explicit conversion (forcefully converting a decimal value into a integer type and we are ok with some data loss)
         System.out.println(b);

         */
         
        
    }
}
