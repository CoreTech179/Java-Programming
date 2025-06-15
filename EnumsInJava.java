enum Day{

    // Here we write the constant values in a comma seperated way
    // Basically here we have list some days & the relationship is Like that (SUNDAY is a Day, MONDAY is a Day, TUESDAY is a Day,...,etc. like that)

    SUNDAY("sunday"),  // We are Setting our own defined fields by passing it as a parameter to the enum instances through our custom constructor

    MONDAY("monday"), 

    TUESDAY("tuesday"), 

    WEDNESDAY("wednesday"), 

    THUSDAY("thusday"), 

    FRIDAY("friday"), 

    SATURDAY("saturday");

    // The above SUNDAY, MONDAY...., etc these are all final object of the Day class. Because at the compilation time it becames a class


    // Since enums are ultimately converted into a Class therefore we can write methods inside it also

    public void display(){
        System.out.println("Today is " + this.name());
        // this.name() --> returns the Day in a String format
    }

    // We can declare fields & custom constructor inside our enums after declaring the CONSTANT Values & also we can pass this field as a parameter to the CONSTANT Variables

    private String lower;


    // Always 1st default enum Constructor will be called and then our custom constructor will be called

    private Day(String lower){
        System.out.println("Our constructor is called");
        this.lower = lower;
    }

    // Return the Days in lowerCase
    public String getLowerCaseDay(){
        return lower;
    }


}


public class EnumsInJava {
    public static void main(String[] args) {
        /*
         * Q. What is a Enum ?
         * 
         * Full form of Enum is Enumeration (i.e. Listing Things)
         * 
         * Example: How many departments are there in a college or No of days in a week, etc
         * 
         */

        //  Suppose we are doing this multiple times

        /*           
         * 
         *  System.out.println("MONDAY");
            System.out.println("MONDAY");
            System.out.println("MONDAY");
            System.out.println("MONDAY");
            System.out.println("MONDAY");
            System.out.println("MONDAY");
            System.out.println("MONDAY");
            System.out.println("MONDAY");
            System.out.println("MONDAY");
         * 
         * 
         */

        // The above thing is totally wrong because if we are using the same data multiple times than we can define a enum for this

        // We can print the data of enums also

        System.out.println(Day.MONDAY);


        // Since MONDAY is a object therfore we can create a reference variable for that object of the Day class

        Day monday = Day.MONDAY;

        int indexNumber = monday.ordinal(); // It gives the index number 
        System.out.println(indexNumber);

        Day [] days = Day.values();  // returns an array of Days

        for(Day element : days){
            System.out.println(element); // Printing all the days in a week through a loop
        }

        monday.display();


        // Testing our custom constructor

        Day tuesday = Day.TUESDAY;

        System.out.println(tuesday.getLowerCaseDay());



        // We can also run switch case on Enum also

        switch (monday) {
            case MONDAY: {
                System.out.println("M");
            }
            break;
            case TUESDAY: {
                System.out.println("T");
            }
            break;
        
            default:
                System.out.println("S");;
        }

    }
}
