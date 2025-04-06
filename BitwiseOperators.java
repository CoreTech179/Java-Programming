public class BitwiseOperators {
    public static void main(String[] args) {
        
        /*
            Bitwise Operators In Java are (&, |, ~, ^, <<, >>)
            1. And (&)
            2. OR (|)
            3. NOT (~)
            4. XOR (^)
            5. Left Shift (<<)
            6. Right Shift (>>)

            Q.Where we can apply Bitwise Operators ?
            We can apply Bitwise Operators on (byte, short, int, long) but we can't apply Bitwise Operators on decimal Types (i.e float, double)

            // Computers stores any value in the form of 0 & 1 and we can see a particular value binary form by using toBinaryString(number) function.

            ex. Byte.toBinaryString(number);
            ex. Short.toBinaryString(number);
            ex. Integer.toBinaryString(number);
            ex. Double.toBinaryString(number);

            A  B  &  |  ^
            0  0  0  0  0
            0  1  0  1  1
            1  0  0  1  1
            1  1  1  1  0

            1. AND operator (&) = If any bit either in A or B is 0 than output is 0 else 1
            2. OR  operator (|) = If any bit either in A or B is having 1 than output will be 1 else 0
            3. XOR operator (^) = If any bit either in A or B is having same bit value than 0 else if diffrent bit than 1
            4. NOT operator (~) = Converts 1 to 0 and vice-versa.

         */

         int a = 5 & 4;
         int b = 5 | 4;
         int c = 5 ^ 4;

         System.out.println(a);
         System.out.println(b);
         System.out.println(c);

         int d = 0;
         System.out.println(Integer.toBinaryString(d));
         int f = ~d;
         System.out.println(Integer.toBinaryString(f));
         System.out.println(f);


        //  Left Shift

        int number1 = 5;

        int reslt1 = number1 << 1; // Left shift operator will shift each an indivisual bit to left side by a certain no. of positions you have provided.
        int reslt2 = number1 >> 1; // Right shift operator will shift each an indivisual bit to right side by a certain no. of positions you have provided.

        System.out.println(reslt1);
        System.out.println(reslt2);



        // No Rocket Science !!


    }
}
