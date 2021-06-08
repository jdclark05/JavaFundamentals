import java.util.ArrayList;

class ListOfExceptions{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch(Exception e){
                System.out.println("Errors: " + e + " - Index of error: " + i + " - Value at error index: " + myList.get(i));
            } finally {
                System.out.println("Execution Failed");
            }
        }
    }
}