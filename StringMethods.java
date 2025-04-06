public class StringMethods {
    public static void main(String[] args) {
        /*
            Q. What is a method ?
            --> Basically a method is defined as, when we want to perform a particular task repeatedly than we use a method. When we need to perform the same task then we can invoke that particular method and get our work done.
            --> Advantage is that we can use the method as many times as required.  
         */

        //  String Methods

        String name = "Akash";

        // Want to find out the length of the String we can do it
        System.out.println(name.length());

        // Want to extract a particular character from the String we can do it
        char c = name.charAt(2); // Index value is Starting from 0 onwards (i.e. In this case A = 0, k = 1, a = 2, s = 3, h = 4)
        System.out.println(c);

        // Want to check the equality we can do it
        String name1 = "ram";
        String name2 = "Ram";

        boolean isSame = (name1.equals(name2)) ? true : false ; // What is this ? This is called ternary operator. Later in the if-else part we will discuss about this.

        // Note: Strings are case sensetive. It means if you change a single indivisual character from upper to lower case or vice-versa than equals method will return false.

        // But you can avoid case-sensetive by using equalsIgnoreCase() method in Java String

        boolean isEqual = (name1.equalsIgnoreCase(name2)) ? true : false ;

        System.out.println(isSame);
        System.out.println(isEqual);


        // Want to extract some portion of a String we can do it

        System.out.println(name.substring(0, 4)); // where starting index will be included and last index will be excluded. It will return the portion of a string from 0 to 3

        // Want to convert the entire String into a Uppercase or Lowercase then we can do it
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Note: Here original string is not changing, here a entire new string is created and returned. Once we declared a String we can't change it.

        String name3 = "          Hello          ";
        System.out.println(name3.trim()); // Basically this trim method will remove all the unneccessary spaces and returns a new string.

        // Suppose we want to replace the String than also we can do it
        System.out.println(name.replace("Akash", "Akshit"));

        // This replace method is capbale to replace a single character also


        // We can also check whether something is present inside our String or not
        System.out.println(name.contains("k"));

        // We can also check whether a String is starting with a particular character or ends with a particular character
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("t"));

        // We can also check whether a String is empty or not
        String str = " ";
        System.out.println(str.isEmpty()); // str is not empty because it contains space threfore false
        System.out.println(str.isBlank()); // str contains a space but it is entire blank therefore true

        // We can also find out the index value of a particular character of the string if we want
        System.out.println(name.indexOf('A'));


        // We can also convert a Integer number into a String
        int number = 10;
        String s = Integer.toString(number);
        System.out.println(s.getClass()); // s is a String now which is converted from an integer number.


        
        
    }
}
