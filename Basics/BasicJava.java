import java.util.ArrayList;

public class BasicJava {
    public Integer countAndPrint(int x){
        for(int i = 1; i <= x; i++){
            System.out.println(i);
        }
        return x;
    }

    public Integer countOddsAndPrint(int x){
        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            } else {
                continue;
            }
        }
        return x;
    }

    public Integer printSum(int x){
        int total = 0;
        for(int i = 0; i <= x; i++){
            System.out.println("New Number: " + i);
            total += i;
            System.out.println("Sum: " + total);
        }
        return x;
    }

    public String iteratingArray(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.println("Array Index[" +i+ "] = " + arr.get(i));
        }
        return "Complete";
    }

    public Integer findMax(ArrayList<Integer> arr){
        int num = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > num){
                num = arr.get(i);
            }
        }
        return num;
    }

    public Integer getAverage(ArrayList<Integer> arr){
        int num = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            num += arr.get(i);
            count++;
        }
        int av = num/count;
        return av;
    }

    public ArrayList<Integer> arrayOfOdds(int x){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                myArray.add(i);
            } else {
                continue;
            }
        }
        return myArray;
    }

    public Integer greaterThanY(ArrayList<Integer> arr, int x){
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > x){
               count++; 
            }
        }
        return count;
    }

    public ArrayList<Integer> squareValues(ArrayList<Integer> arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i < arr.size(); i++){
            int newNum = arr.get(i);
            int squared = newNum * newNum;
            myArray.add(squared);
        }
        return myArray;
    }

    public ArrayList<Integer> noNegatives(ArrayList<Integer> arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) >= 0){
                myArray.add(arr.get(i));
            }
        }
        return myArray;
    }

    public ArrayList<Object> minMaxAverage(ArrayList<Integer> arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++){
            total += arr.get(i);
            count++;
            if(arr.get(i) > max){
                max = arr.get(i);
            }
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        int average = total/count;
        String av = "Average: " + average;
        String addMin = "Minimum: " + min;
        String addMax = "Maximum: " + max;
        myArray.add(addMin);
        myArray.add(addMax);
        myArray.add(av);
        return myArray;
    }

    public ArrayList<Integer> shiftingValues(ArrayList<Integer> arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i < arr.size(); i++){
            myArray.add(arr.get(i));
        }
        myArray.add(arr.get(0));
        return myArray;
    }
}