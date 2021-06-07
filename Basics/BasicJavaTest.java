import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava arrayTest = new BasicJava();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(4); arr1.add(9); arr1.add(19); arr1.add(-2); arr1.add(6); arr1.add(27); arr1.add(-16); arr1.add(1);

        Integer a = arrayTest.countAndPrint(255);
        System.out.println("Completed: Counting And Printing All Values From 1 To: " + a);

        Integer b = arrayTest.countOddsAndPrint(255);
        System.out.println("Completed: Printing All Odd Numbers From 1 To: " + b);

        Integer c = arrayTest.printSum(255);
        System.out.println("Completed: Print All Numbers & Collective Sums From 1 To: " + c);

        System.out.println("Iterating Defined Array: " + arrayTest.iteratingArray(arr1));

        Integer d = arrayTest.findMax(arr1);
        System.out.println("Find Max of Defined Array: " + d);

        Integer e = arrayTest.getAverage(arr1);
        System.out.println("Average of Defined Array: " + e);

        System.out.println("New Array of All Odd Numbers From 1 to 255: " + arrayTest.arrayOfOdds(255));

        Integer f = arrayTest.greaterThanY(arr1, 10);
        System.out.println("Defined Array Values Greater Than Y(10): " + f);

        System.out.println("Square Values of Defined Array: " + arrayTest.squareValues(arr1));

        System.out.println("New Defined Array With No Negative Numbers: " + arrayTest.noNegatives(arr1));

        System.out.println("Min, Max, & Average of Defined Array: " + arrayTest.minMaxAverage(arr1));

        System.out.println("Shifting Values 1 Place in Defined Array: From " + arr1 + " to " + arrayTest.shiftingValues(arr1));
    }
}
