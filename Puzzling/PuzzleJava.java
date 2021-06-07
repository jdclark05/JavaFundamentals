import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public Integer sumAndNewArray(ArrayList<Integer> arr) {
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
            if(arr.get(i) > 10){
                newArray.add(arr.get(i));
            }
        }
        System.out.println("New Array: " + newArray);
        return sum;
    }

    public ArrayList<String> peopleShuffleAndPrint(ArrayList<String> arr){
        ArrayList<String> peopleArr = new ArrayList<String>();
        Collections.shuffle(arr);
        System.out.println("Shuffled Name Array: " + arr);
        for(int i = 0; i < arr.size(); i++){
            String str1 = new String(arr.get(i));
            if(str1.length() > 5){
                peopleArr.add(str1);
            }
        }
        return peopleArr;
    }

    public String letterShuffleAndPrint(ArrayList<String> arr){
        String message = "";
        Collections.shuffle(arr);
        System.out.println("First Letter: " + arr.get(0));
        System.out.println("Last Letter: " + arr.get(25));
        if(arr.get(0) == "A" || arr.get(0) == "E" || arr.get(0) == "I" || arr.get(0) == "O" || arr.get(0) == "U"){
            message+="Pat Sajak and Vanna White are gonna need their $250.00";
        }
        if(arr.get(0) != "A" || arr.get(0) != "E" || arr.get(0) != "I" || arr.get(0) != "O" || arr.get(0) != "U"){
            message+="No vowels in today's puzzle!";
        }
        return message;
    }

    public ArrayList<Integer> randomNumbersArray(int num){
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        int min = 55;
        int max = 100;
        for(int i = 0; i < num; i++){
            Random r = new Random();
            int newNum = (r.nextInt(100 - 55));
            randomNumbers.add(newNum);
        }
        return randomNumbers;
    }

    public ArrayList<Integer> randomNumbersArraySorted(int num){
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        for(int i = 0; i < num; i++){
            Random r = new Random();
            int newNum = (r.nextInt(100 - 55));
            randomNumbers.add(newNum);
        }
        Collections.sort(randomNumbers);
        String minVal = "Minimum Value: " + randomNumbers.get(0);
        String maxVal = "Maximum Value: " + randomNumbers.get(9);
        System.out.println(minVal + " " + maxVal);
        return randomNumbers;
    }

    public String randomString(ArrayList<String> arr, int j){
        String rStr = "";
        for(int i = 0; i < j; i++){
            Random r = new Random();
            int newNum = (r.nextInt(25 - 0));
            rStr += (arr.get(newNum));
        }
        return rStr;
    }

    public ArrayList<String> randomStringCollection(ArrayList<String> arr, int x, int y){
        ArrayList<String> newArray = new ArrayList<String>();
        String rStr = "";
        for(int j = 0; j < y; j++){
            for(int i = 0; i < x; i++){
                Random r = new Random();
                int newNum = (r.nextInt(25 - 0));
                rStr += (arr.get(newNum));
            }
            newArray.add(rStr);
            rStr = "";
        }
        return newArray;
    }

}