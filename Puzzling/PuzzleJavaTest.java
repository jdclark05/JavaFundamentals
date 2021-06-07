import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzleTest = new PuzzleJava();
        ArrayList<Integer> numberArr = new ArrayList<Integer>();
        numberArr.add(3);
        numberArr.add(5);
        numberArr.add(1);
        numberArr.add(2);
        numberArr.add(7);
        numberArr.add(9);
        numberArr.add(8);
        numberArr.add(13);
        numberArr.add(25);
        numberArr.add(32);

        ArrayList<String> peopleArr = new ArrayList<String>();
        peopleArr.add("Nancy");
        peopleArr.add("Jinichi");
        peopleArr.add("Fujibayashi");
        peopleArr.add("Momochi");
        peopleArr.add("Ishikawa");

        ArrayList<String> letterArr = new ArrayList<String>();
        letterArr.add("A");
        letterArr.add("B");
        letterArr.add("C");
        letterArr.add("D");
        letterArr.add("E");
        letterArr.add("F");
        letterArr.add("G");
        letterArr.add("H");
        letterArr.add("I");
        letterArr.add("J");
        letterArr.add("K");
        letterArr.add("L");
        letterArr.add("M");
        letterArr.add("N");
        letterArr.add("O");
        letterArr.add("P");
        letterArr.add("Q");
        letterArr.add("R");
        letterArr.add("S");
        letterArr.add("T");
        letterArr.add("U");
        letterArr.add("V");
        letterArr.add("W");
        letterArr.add("X");
        letterArr.add("Y");
        letterArr.add("Z");


        Integer a = puzzleTest.sumAndNewArray(numberArr);
        System.out.println("Sum of all array numbers: " + a);

        ArrayList<String> newNameArr = puzzleTest.peopleShuffleAndPrint(peopleArr);
        System.out.println("Names in array Longer than 5 characters: " + newNameArr);

        String message = puzzleTest.letterShuffleAndPrint(letterArr);
        System.out.println("Completed: Shuffle Array and Print First/Last (with message):" + message);

        int w = 10;
        ArrayList<Integer> randomNumbers = puzzleTest.randomNumbersArray(w);
        System.out.println("Your random numbers are: " + randomNumbers);

        ArrayList<Integer> rNumbers = puzzleTest.randomNumbersArraySorted(10);
        System.out.println("Sorted Random Numbers Array: " + rNumbers);

        int x = 5;
        String randomStr1 = puzzleTest.randomString(letterArr, x);
        System.out.println("Randomly Generated String: " + randomStr1);

        int y = 5;
        int z = 10;
        ArrayList<String> rStrings = puzzleTest.randomStringCollection(letterArr, y, z);
        System.out.println("Randomly Generated String Collection: " + rStrings);
        
    }
}
